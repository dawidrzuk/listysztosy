package com.example.listysztosy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stos = LinkedList<Int>()
        val dodajstos = findViewById<Button>(R.id.button)
        val usunstos = findViewById<Button>(R.id.button2)
        val napis = findViewById<EditText>(R.id.editTextTextPersonName)
        val text = findViewById<TextView>(R.id.textView)
        dodajstos.setOnClickListener {
            if (stos.isEmpty()) {
                usunstos.isEnabled = true
                stos.addFirst(napis.text.toString().toInt())
                text.text = stos.first.toString()
            }
            else {
                stos.add(dodajstos.text.toString().toInt())
                text.text = stos.last.toString()
            }
        }

    }
}