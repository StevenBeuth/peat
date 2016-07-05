package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Wird initial beim Start der App aufgerufen.
 * Splash enthaelt Bild und Musik.
 * Au�erdem wird beim Start die Datenbank geloescht.
 * 
 * @author AndreasMosig
 * @version v1.0.1
 * 
 */
@TargetApi(Build.VERSION_CODES.M)
public class Splash extends AppCompatActivity {

	MediaPlayer startSong;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		startSong = MediaPlayer.create(Splash.this, R.raw.splashsound);
		startSong.start();
		//In Produktion auskommentieren!
		this.deleteDatabase("peat.db");
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent further = new Intent("com.SoftwareProject.beuth.MAIN");
					startActivity(further);
				}
			}
		};
		timer.start();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		startSong.release();
		finish();
	}
}