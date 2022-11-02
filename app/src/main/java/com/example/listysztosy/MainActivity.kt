package com.example.listysztosy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stos = LinkedList<Int>()
        val dodaj = findViewById<Button>(R.id.button)
        val usun = findViewById<Button>(R.id.button2)
    }

}