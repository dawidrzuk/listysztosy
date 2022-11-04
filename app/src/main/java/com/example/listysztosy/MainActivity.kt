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
        val pokazostatni = findViewById<Button>(R.id.button4)
        val napis = findViewById<EditText>(R.id.editTextNumber)
        val ostatni = findViewById<TextView>(R.id.textView)
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
                ostatni.text = "stos jest pusty!"
            }
            }
        pokazostatni.setOnClickListener {
            ostatni.text = stos.last.toString()
        }
        /* KOLEJKA */
         val kolejka: Queue<Int> = LinkedList<Int>()
         val dodajkolejka = findViewById<Button>(R.id.button5)
        val usunkolejka = findViewById<Button>(R.id.button6)
        val textkolejka = findViewById<EditText>(R.id.editTextNumber2)
        val pokazost = findViewById<Button>(R.id.button7)
        val pokazpierw = findViewById<Button>(R.id.button8)
        val ostatnikolejka = findViewById<TextView>(R.id.textView4)
        val pierwszykolejka = findViewById<TextView>(R.id.textView5)

        dodajkolejka.setOnClickListener {
            kolejka.add(textkolejka.text.toString().toInt())
        }
        usunkolejka.setOnClickListener {
            kolejka.remove()
        }
        pokazost.setOnClickListener {
            val ost = kolejka.last()
            ostatnikolejka.text = ost.toString()
        }
        pokazpierw.setOnClickListener {
            val pierw = kolejka.first()
            pierwszykolejka.text = pierw.toString()
        }
    }
}