package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.inputmethod.InputMethodManager;

@TargetApi(Build.VERSION_CODES.M)
public class QuestionInputActivity extends AppCompatActivity {
	
	private String QuestionTypeTitle;
	private String questionText;
	private String[] answers;
	private Boolean[] isCorrect;
	
	private RadioGroup radioGroupCorrect;
	private PeatDataSource dataSource;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		dataSource = new PeatDataSource(this);
		dataSource.open();
		answers = new String[1];
		isCorrect = new Boolean[1];
		Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
		setContentView(R.layout.activity_question_input);
		
		Button addQuestion = (Button) findViewById(R.id.saveQuestionTypeClosed);
		
		addQuestion.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			    
				// Auslesen verstecktes Feld Fragetyp - f�r Prototyp erstmal hartcodiert
				QuestionTypeTitle = "Choice";
				
				// Auslesen Textfeld Thema
				// ?
				
				// Auslesen Textfeld Frage
				EditText editQuestionTypeOpenTheme = (EditText) findViewById(R.id.editQuestionTypeClosedQuestion);
				// Eingabe in einen String umwandeln
				questionText = editQuestionTypeOpenTheme.getText().toString();
				// Pr�fen, ob Feld leer ist
				if(TextUtils.isEmpty(questionText)) {
					editQuestionTypeOpenTheme.setError(getString(R.string.editText_errorMessage));
				    return;
				}
				// Textfeld leeren
				editQuestionTypeOpenTheme.setText("");
				
				// Auslesen Textfeld Antwort
				EditText editQuestionTypeOpenAnswer = (EditText) findViewById(R.id.editQuestionTypeClosedAnswer);
				// Eingabe in einen String umwandeln
				String answersTemp = editQuestionTypeOpenAnswer.getText().toString();
				answers[0]= answersTemp;
				// Pr�fen, ob Feld leer ist
				if(TextUtils.isEmpty(answers[0])) {
					editQuestionTypeOpenAnswer.setError(getString(R.string.editText_errorMessage));
				    return;
				}
				// Textfeld leeren
				editQuestionTypeOpenAnswer.setText("");
				
				// Auslesen Textfeld isCorrect - f�r Prototyp erstmal hartcodiert
				isCorrect[0] = true;
				
				
			    // Speichern der ausgelesenen Werte in die SQLite Datenbank
				// 1. Question-Objekt erzeugen
				Question oQuestion = new Question(questionText, QuestionTypeTitle, answers, isCorrect);
				// 2. Speichermethode auf dem Question-Objekt aufrufen
				dataSource.putQuestionInDB(oQuestion);
				dataSource.logAllQuestionsOfDB();
				
			    // Aktualisieren der Anzeige
				
				radioGroupCorrect = (RadioGroup) findViewById(R.id.radioQuestionCorrect);
				
		        Toast.makeText(QuestionInputActivity.this, "Frage gespeichert.", Toast.LENGTH_LONG).show();
		        
			}
		});

		Toast.makeText(this, "Zur�ck mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
	
}