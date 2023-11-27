package com.example.quizgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.quizgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        var helpofNumbers:  Int
        val text: TextView = binding.textID
        val helpText: TextView = binding.numbersofHelp
        val hintText: TextView = binding.hint
        val button1: Button = binding.answerButton1
        val button2: Button = binding.answerButton2
        val button3: Button = binding.answerButton3
        val button4: Button = binding.answerButton4
        val helpButton: Button = binding.helpButton
        val helper = GameDB(applicationContext)
        val db = helper.readableDatabase
        val rs = db.rawQuery("SELECT * FROM MAINTABLE", null)
        val easydifficulty = intent.getBooleanExtra("EasyDifficulty", false)
        val normaldifficulty = intent.getBooleanExtra("NormalDifficulty", false)
        val harddifficulty = intent.getBooleanExtra("HardDifficulty", false)
        var correctAnswer: String
        val allofQuestionNumber = rs.count
        val winIntent = Intent(this@MainActivity, WinActivity::class.java)
        val loseIntent = Intent (this@MainActivity, LoseActivity::class.java)
        var points: Int

        if (easydifficulty)
        {
            helpofNumbers = 3
            points = 0
            helpText.text = "Segítségek száma: $helpofNumbers"
                var i = 0
                rs.moveToPosition(i)
                text.text = rs.getString(1)
                button1.text = rs.getString(2)
                button2.text = rs.getString(3)
                button3.text = rs.getString(4)
                button4.text = rs.getString(5)
                correctAnswer = rs.getString(6)
                button1.setOnClickListener {
                    if (correctAnswer == button1.text)
                    {
                        Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                        if (i != allofQuestionNumber)
                        {
                            rs.moveToPosition(i++)
                            text.text = rs.getString(1)
                            button1.text = rs.getString(2)
                            button2.text = rs.getString(3)
                            button3.text = rs.getString(4)
                            button4.text = rs.getString(5)
                            correctAnswer = rs.getString(6)
                            points++
                        }
                        else
                        {
                            Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                            winIntent.putExtra("points", points)
                            startActivity(winIntent)
                        }
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                        startActivity(loseIntent)
                    }
                }
                button2.setOnClickListener {
                    if (correctAnswer == button2.text)
                    {
                        Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                        if (i != allofQuestionNumber)
                        {
                            rs.moveToPosition(i++)
                            text.text = rs.getString(1)
                            button1.text = rs.getString(2)
                            button2.text = rs.getString(3)
                            button3.text = rs.getString(4)
                            button4.text = rs.getString(5)
                            correctAnswer = rs.getString(6)
                            points++
                        }
                        else
                        {
                            Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                            winIntent.putExtra("points", points)
                            startActivity(winIntent)
                        }
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                        startActivity(loseIntent)
                    }
                }
                button3.setOnClickListener {
                    if (correctAnswer == button3.text)
                    {
                        Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                        if (i != allofQuestionNumber)
                        {
                            rs.moveToPosition(i++)
                            text.text = rs.getString(1)
                            button1.text = rs.getString(2)
                            button2.text = rs.getString(3)
                            button3.text = rs.getString(4)
                            button4.text = rs.getString(5)
                            correctAnswer = rs.getString(6)
                            points++
                        }
                        else
                        {
                            Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                            winIntent.putExtra("points", points)
                            startActivity(winIntent)
                        }
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                        startActivity(loseIntent)
                    }
                }
                button4.setOnClickListener {
                    if (correctAnswer == button4.text)
                    {
                        Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                        if (i != allofQuestionNumber)
                        {
                            rs.moveToPosition(i++)
                            text.text = rs.getString(1)
                            button1.text = rs.getString(2)
                            button2.text = rs.getString(3)
                            button3.text = rs.getString(4)
                            button4.text = rs.getString(5)
                            correctAnswer = rs.getString(6)
                            points++
                        }
                        else
                        {
                            Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                            winIntent.putExtra("points", points)
                            startActivity(winIntent)
                        }
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                        startActivity(loseIntent)
                    }
                }
            helpButton.setOnClickListener {
                if (helpofNumbers > 0)
                {
                    hintText.text = rs.getString(7)
                    helpofNumbers--
                    helpText.text = "Segítségek száma: $helpofNumbers"
                }
                else
                {
                    hintText.text = "Nincs több segítség!"
                }
            }
        }
        else if (normaldifficulty)
        {
            points = 0
            helpofNumbers = 2
            helpText.text = "Segítségek száma: $helpofNumbers"
            var i = 0
            rs.moveToPosition(i)
            text.text = rs.getString(1)
            button1.text = rs.getString(2)
            button2.text = rs.getString(3)
            button3.text = rs.getString(4)
            button4.text = rs.getString(5)
            correctAnswer = rs.getString(6)
            button1.setOnClickListener {
                if (correctAnswer == button1.text)
                {
                    Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                    if (i != allofQuestionNumber)
                    {
                        rs.moveToPosition(i++)
                        text.text = rs.getString(1)
                        button1.text = rs.getString(2)
                        button2.text = rs.getString(3)
                        button3.text = rs.getString(4)
                        button4.text = rs.getString(5)
                        correctAnswer = rs.getString(6)
                        points++
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                        winIntent.putExtra("points", points)
                        startActivity(winIntent)
                    }
                }
                else
                {
                    Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                    startActivity(loseIntent)
                }
            }
            button2.setOnClickListener {
                if (correctAnswer == button2.text)
                {
                    Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                    if (i != allofQuestionNumber)
                    {
                        rs.moveToPosition(i++)
                        text.text = rs.getString(1)
                        button1.text = rs.getString(2)
                        button2.text = rs.getString(3)
                        button3.text = rs.getString(4)
                        button4.text = rs.getString(5)
                        correctAnswer = rs.getString(6)
                        points++
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                        winIntent.putExtra("points", points)
                        startActivity(winIntent)
                    }
                }
                else
                {
                    Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                    startActivity(loseIntent)
                }
            }
            button3.setOnClickListener {
                if (correctAnswer == button3.text)
                {
                    Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                    if (i != allofQuestionNumber)
                    {
                        rs.moveToPosition(i++)
                        text.text = rs.getString(1)
                        button1.text = rs.getString(2)
                        button2.text = rs.getString(3)
                        button3.text = rs.getString(4)
                        button4.text = rs.getString(5)
                        correctAnswer = rs.getString(6)
                        points++
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                        winIntent.putExtra("points", points)
                        startActivity(winIntent)
                    }
                }
                else
                {
                    Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                    startActivity(loseIntent)
                }
            }
            button4.setOnClickListener {
                if (correctAnswer == button4.text)
                {
                    Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                    if (i != allofQuestionNumber)
                    {
                        rs.moveToPosition(i++)
                        text.text = rs.getString(1)
                        button1.text = rs.getString(2)
                        button2.text = rs.getString(3)
                        button3.text = rs.getString(4)
                        button4.text = rs.getString(5)
                        correctAnswer = rs.getString(6)
                        points++
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                        winIntent.putExtra("points", points)
                        startActivity(winIntent)
                    }
                }
                else
                {
                    Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                    startActivity(loseIntent)
                }
            }
            helpButton.setOnClickListener {
                if (helpofNumbers > 0)
                {
                    hintText.text = rs.getString(7)
                    helpofNumbers--
                    helpText.text = "Segítségek száma: $helpofNumbers"
                }
                else
                {
                    hintText.text = "Nincs több segítség!"
                }
            }
        }
        else if (harddifficulty)
        {
            points = 0
            helpofNumbers = 1
            helpText.text = "Segítségek száma: $helpofNumbers"
            var i = 0
            rs.moveToPosition(i)
            text.text = rs.getString(1)
            button1.text = rs.getString(2)
            button2.text = rs.getString(3)
            button3.text = rs.getString(4)
            button4.text = rs.getString(5)
            correctAnswer = rs.getString(6)
            button1.setOnClickListener {
                if (correctAnswer == button1.text)
                {
                    Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                    if (i != allofQuestionNumber)
                    {
                        rs.moveToPosition(i++)
                        text.text = rs.getString(1)
                        button1.text = rs.getString(2)
                        button2.text = rs.getString(3)
                        button3.text = rs.getString(4)
                        button4.text = rs.getString(5)
                        correctAnswer = rs.getString(6)
                        points++
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                        winIntent.putExtra("points", points)
                        startActivity(winIntent)
                    }
                }
                else
                {
                    Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                    startActivity(loseIntent)
                }
            }
            button2.setOnClickListener {
                if (correctAnswer == button2.text)
                {
                    Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                    if (i != allofQuestionNumber)
                    {
                        rs.moveToPosition(i++)
                        text.text = rs.getString(1)
                        button1.text = rs.getString(2)
                        button2.text = rs.getString(3)
                        button3.text = rs.getString(4)
                        button4.text = rs.getString(5)
                        correctAnswer = rs.getString(6)
                        points++
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                        winIntent.putExtra("points", points)
                        startActivity(winIntent)
                    }
                }
                else
                {
                    Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                    startActivity(loseIntent)
                }
            }
            button3.setOnClickListener {
                if (correctAnswer == button3.text)
                {
                    Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                    if (i != allofQuestionNumber)
                    {
                        rs.moveToPosition(i++)
                        text.text = rs.getString(1)
                        button1.text = rs.getString(2)
                        button2.text = rs.getString(3)
                        button3.text = rs.getString(4)
                        button4.text = rs.getString(5)
                        correctAnswer = rs.getString(6)
                        points++
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                        winIntent.putExtra("points", points)
                        startActivity(winIntent)
                    }
                }
                else
                {
                    Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                    startActivity(loseIntent)
                }
            }
            button4.setOnClickListener {
                if (correctAnswer == button4.text)
                {
                    Toast.makeText(applicationContext, "Helyes válasz!", Toast.LENGTH_SHORT).show()
                    if (i != allofQuestionNumber)
                    {
                        rs.moveToPosition(i++)
                        text.text = rs.getString(1)
                        button1.text = rs.getString(2)
                        button2.text = rs.getString(3)
                        button3.text = rs.getString(4)
                        button4.text = rs.getString(5)
                        correctAnswer = rs.getString(6)
                        points++
                    }
                    else
                    {
                        Toast.makeText(applicationContext, "A játék vége!", Toast.LENGTH_SHORT).show()
                        winIntent.putExtra("points", points)
                        startActivity(winIntent)
                    }
                }
                else
                {
                    Toast.makeText(applicationContext, "Helytelen válasz!", Toast.LENGTH_SHORT).show()
                    startActivity(loseIntent)
                }
            }
            helpButton.setOnClickListener {
                if (helpofNumbers > 0)
                {
                    hintText.text = rs.getString(7)
                    helpofNumbers--
                    helpText.text = "Segítségek száma: $helpofNumbers"
                }
                else
                {
                    hintText.text = "Nincs több segítség!"
                }
            }
        }
    }
}