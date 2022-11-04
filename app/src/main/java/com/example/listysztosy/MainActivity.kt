package com.example.listysztosy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stos = LinkedList<Int>()
        val dodajstos = findViewById<Button>(R.id.button2)
        val usunstos = findViewById<Button>(R.id.button)
        val pokazpierwszy = findViewById<Button>(R.id.button3)
        val pokazostatni = findViewById<Button>(R.id.button4)
        val napis = findViewById<EditText>(R.id.editTextNumber)
        val ostatni = findViewById<TextView>(R.id.textView)
        val pierwszy = findViewById<TextView>(R.id.textView2)
        dodajstos.setOnClickListener {
            if (stos.isEmpty()) {
                stos.addFirst(napis.text.toString().toInt())
                usunstos.isEnabled = true
            }
            else {
                stos.add(napis.text.toString().toInt())
            }
        }
        usunstos.setOnClickListener {
            stos.removeLast()
            if (stos.isEmpty())
            {
                usunstos.isEnabled = false
            }
            }
        pokazpierwszy.setOnClickListener {
            pierwszy.text = stos.first.toString()
        }
        pokazostatni.setOnClickListener {
            ostatni.text = stos.last.toString()
        }
    }
}