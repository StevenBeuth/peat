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
    	Integer i;
    	database.execSQL("INSERT INTO " + dbHelper.TABLE_QUESTIONS + " (qst_idQuestionType,qst_text) VALUES(" + getIdFromQuestionTypeTitle(oQuestion.getQuestionTypeTitle()) + 
    			", '" + oQuestion.getQuestionText() +"')");
    	answers = oQuestion.getAnswers();
    	bool_isCorrect = oQuestion.getIsCorrectAnswers();
        for (i=0; i<answers.length; i++) {
        	database.execSQL("INSERT INTO Answers (as_idQuestion, as_text, as_isCorrect) VALUES (SELECT MAX(idQuestion) FROM Question WHERE qst_text='" + oQuestion.getQuestionText() + "', " + answers[i] + ", " + bool_isCorrect[i] + ")");
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
    
    public Question getNextQuestion(){
    	//TODO
    	try {
	    	Question oQuestion;
	    	String[] answersArray;
	    	Boolean[] isCorrectArray;
	    	answersArray = new String[1];
	    	isCorrectArray = new Boolean[1];
	    	String sIsCorrect;
	    	//Cursor mCursor = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType JOIN Answers ON idQuestions = as_idQuestions WHERE idQuestions NOT IN (SELECT uhq_idQuestions FROM PeatUser_has_Questions)", null);
	    	Cursor mCursor = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType "+
	    	"JOIN Answers ON idQuestions = as_idQuestions", null);
	    	mCursor.moveToFirst();
	    	String QuestionText = mCursor.getString(mCursor.getColumnIndex("qst_text"));
	    	String QuestionTypeTitle = mCursor.getString(mCursor.getColumnIndex("qt_title"));
	    	database.execSQL("INSERT INTO PeatUser_has_Questions (uhq_idQuestions, uhq_isIgnore, uhq_idPeatUser) VALUES(" + mCursor.getColumnIndex("idQuestions") + ", 0, (SELECT MAX(idPeatUser) FROM PeatUser WHERE us_name = 'Steven'))");
	    	Integer i=0;
	    	while(!mCursor.isAfterLast()) {
	    		answersArray[i] = mCursor.getString(mCursor.getColumnIndex("as_text"));
	    		sIsCorrect = mCursor.getString(mCursor.getColumnIndex("as_isCorrect"));
	    		if (sIsCorrect == "True") {
					isCorrectArray[i] = true;
	    		}else {
	    			isCorrectArray[i] = false;
	    		}
	    		mCursor.moveToNext();
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
    	//TODO
    	return array;
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