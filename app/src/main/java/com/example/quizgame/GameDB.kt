package com.example.quizgame

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class GameDB (context: Context): SQLiteOpenHelper(context,
    "USERDB", null, 1)  {

    override fun onCreate(db: SQLiteDatabase?) {
       db?.execSQL("CREATE TABLE MAINTABLE(ID INTEGER PRIMARY KEY AUTOINCREMENT, " + "QUESTION TEXT, ANSWER1 TEXT, ANSWER2 TEXT, ANSWER3 TEXT, " +
               "ANSWER4 TEXT, CORRECTANSWER TEXT, HINT TEXT)")
        db?.execSQL("INSERT INTO MAINTABLE(QUESTION, ANSWER1, ANSWER2, ANSWER3, ANSWER4, CORRECTANSWER, HINT)"
        + "VALUES('Mi a kakukktojás?','asztal', 'kecske', 'tenisz', 'palacsinta', 'kecske', 'Van köztük egy élőlény.')")
        db?.execSQL("INSERT INTO MAINTABLE(QUESTION, ANSWER1, ANSWER2, ANSWER3, ANSWER4, CORRECTANSWER, HINT)"
                + "VALUES('Melyik vers egy Petőfi Sándor vers?','Anyám tyúkja', 'Mama', 'Éjszaka', 'Családi kör', 'Anyám tyúkja', 'Az első kivételével a többit nem Petőfi írta.')")
    }


    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}