package com.example.btnefect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            var Nombre:String = "https://www.youtube.com/watch?v=mx0_1wLEUi8"
            val intent = Intent(this, PageActivity2::class .java)
            intent.putExtra("Nombre", Nombre)
            startActivity(intent)
        }
    }
}