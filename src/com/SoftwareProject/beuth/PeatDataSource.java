package com.SoftwareProject.beuth;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/*Diese Klasse ist Data Access Object und f�r Verwalten der Daten verantwortlich
 * - unterh�lt die Datenbankverbindung 
 * - ist f�r Hinzuf�gen, Auslesen und L�schen von Datens�tzen zust�ndig
 * - wandelt Datens�tze in Java-Objekte um
 * 		(So dass Code der Benutzeroberfl�che nicht direkt mit den Datens�tzen arbeiten muss.
 * 		Dies nennt man auch mehrschichtige Architektur.)
 * */

public class PeatDataSource {

    private static final String LOG_TAG = PeatDataSource.class.getSimpleName();

    private SQLiteDatabase database;
    private PeatDbHelper dbHelper;


    public PeatDataSource(Context context) {
        Log.d(LOG_TAG, "DataSource erzeugt dbHelper");
        dbHelper = new PeatDbHelper(context);
    }
    
    public void open() {
	    Log.d(LOG_TAG, "Eine Referenz auf die Datenbank wird jetzt angefragt.");
	    database = dbHelper.getWritableDatabase();
	    Log.d(LOG_TAG, "Datenbank-Referenz erhalten. Pfad zur Datenbank: " + database.getPath());
    }
    
    public void putQuestionInDB(Question oQuestion) {
    	String[] answers;
    	Boolean[] bool_isCorrect;
    	Integer boolSqlite =0;
    	Integer i;
    	database.execSQL("INSERT INTO " + dbHelper.TABLE_QUESTIONS + " (qst_idQuestionType,qst_text) VALUES(" + getIdFromQuestionTypeTitle(oQuestion.getQuestionTypeTitle()) + 
    			", '" + oQuestion.getQuestionText() +"')");
    	answers = oQuestion.getAnswers();
    	bool_isCorrect = oQuestion.getIsCorrectAnswers();

        for (i=0; i<answers.length; i++) {
        	if (bool_isCorrect [i] == true) {
        		boolSqlite = 1;
        	}
        	else {
        		boolSqlite = 0;
        	}
        	database.execSQL("INSERT INTO Answers (as_idQuestions, as_text, as_isCorrect) VALUES ((SELECT MAX(idQuestions) FROM Questions WHERE qst_text='" + oQuestion.getQuestionText() + "'), '" + answers[i] + "', " + boolSqlite +")");
        }
    }
    
    public void getAllTypes() {
    	Cursor mCursor = database.rawQuery("SELECT * FROM QuestionType", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("qt_title")) + ", " +
    			mCursor.getString(mCursor.getColumnIndex("qt_explanation")));
    }
    
    public void getAllTablesOfDB(){
    	Cursor mCursor = database.rawQuery("SELECT tbl_name FROM sqlite_master WHERE type='table';", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Tabellen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("tbl_name")));
    		mCursor.moveToNext();
    	}
    }
    
    public void getAllUserQuestionIDs() {
    	Cursor mCursor = database.rawQuery("SELECT uhq_idQuestions FROM PeatUser_has_Questions", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle IDs von User_Fragen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("uhq_idQuestions")));
    		mCursor.moveToNext();
    	}
    }
    
    public void logAllQuestionsOfDB() {
    	Cursor mCursor = database.rawQuery("SELECT * FROM Questions;", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Fragen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("qst_text")) + "   " + mCursor.getString(mCursor.getColumnIndex("idQuestions")));
    		mCursor.moveToNext();
    	}
    }
      
    public Question getNextQuestion(){
    	//TODO
    	try {
	    	Question oQuestion;
	    	String[] answersArray;
	    	Boolean[] isCorrectArray;
	    	answersArray = new String[0];
	    	isCorrectArray = new Boolean[0];
	    	Integer iIsCorrect;
	    	getAllUserQuestionIDs();
	    	Cursor mCursorQuestions = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType WHERE idQuestions NOT IN (SELECT uhq_idQuestions FROM PeatUser_has_Questions);", null);
	    	//Cursor mCursor = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType JOIN Answers ON idQuestions = as_idQuestions", null);
	    	mCursorQuestions.moveToFirst();
	    	String QuestionText = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("qst_text"));
	    	String idQuestion = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("idQuestions"));
	    	String QuestionTypeTitle = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("qt_title"));
	    	
	    	database.execSQL("INSERT INTO PeatUser_has_Questions (uhq_idQuestions, uhq_isIgnore, uhq_idPeatUser) VALUES(" + idQuestion + ", 0, (SELECT MAX(idPeatUser) FROM PeatUser WHERE us_name = 'Steven'))");
	    	Cursor mCursorAnswers = database.rawQuery("SELECT * FROM Answers WHERE as_idQuestions = " + idQuestion, null);
	    	mCursorAnswers.moveToFirst();
	    	Integer i=0;
	    	while(!mCursorAnswers.isAfterLast()) {
	    		String asText = mCursorAnswers.getString(mCursorAnswers.getColumnIndex("as_text"));
	    		answersArray = addStringToArray(answersArray, asText);
	    		iIsCorrect = mCursorAnswers.getInt(mCursorAnswers.getColumnIndex("as_isCorrect"));
	    		if (iIsCorrect == 1) {
					isCorrectArray = addBooleanToArray(isCorrectArray, true);
	    		}else {
	    			isCorrectArray = addBooleanToArray(isCorrectArray, false);
	    		}
	    		mCursorAnswers.moveToNext();
	    		i=i+1;
	    	}
	    	oQuestion = new Question(QuestionText, QuestionTypeTitle, answersArray, isCorrectArray);
	    	return oQuestion;
    	} catch (Exception e) {
    		Log.d(LOG_TAG, e.toString());
    		String[] antwortFrageA = {"Ja", "Nein"};
    	    Boolean[] isCorrectFrageA = {false, true};
    	    return new Question("Wurde diese Frage in die DB gepackt?", "SimpleText", antwortFrageA, isCorrectFrageA);
    	}
    }
    
    private String[] addStringToArray(String[] array, String string){
    	Integer length = array.length;
    	String[] bufferArray = new String[length + 1];
    	Integer i = 0;
    	while (i < length) {
    		bufferArray[i] = array[i];
    		i++;
    	}
    	bufferArray[length] = string;
    	return bufferArray;
    }
    
    private Boolean[] addBooleanToArray(Boolean[] array, Boolean bool){
    	Integer length = array.length;
    	Boolean[] bufferArray = new Boolean[length + 1];
    	Integer i = 0;
    	while (i < length) {
    		bufferArray[i] = array[i];
    		i++;
    	}
    	bufferArray[length] = bool;
    	return bufferArray;
    }
    
    public Integer getIdFromQuestionTypeTitle(String title){
    	Cursor mCursor = database.rawQuery("SELECT * FROM QuestionType WHERE qt_title = '" + title +"'", null);
    	mCursor.moveToFirst();
    	return mCursor.getInt(mCursor.getColumnIndex("idQuestionType"));
    }

    public void close() {
    	dbHelper.close();
    	Log.d(LOG_TAG, "Datenbank mit Hilfe des DbHelpers geschlossen.");
    }
}