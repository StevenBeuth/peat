package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

@TargetApi(Build.VERSION_CODES.M)
public class QuestionInputActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_input);
		
		Toast.makeText(this, "Zur�ck mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
	
	// Hier muss dann der Code f�r die Eingabe der Fragen hin.
	
}