package com.SoftwareProject.beuth;

import android.content.Context;
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
}

