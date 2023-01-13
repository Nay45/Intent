package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Button
import android.widget.RadioGroup

class activity_data : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val tvDataRecived: TextView = findViewById(R.id.tv_data_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val text = "Name : $name, Your Age : $age"
        tvDataRecived.text = text

        val btnBack : Button = findViewById(R.id.btn_back)
        btnBack.setOnClickListener(this)

    }

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back -> {
                val backToMenu = Intent(this@activity_data, MainActivity :: class.java)
                startActivity(backToMenu)
            }
        }
    }
}