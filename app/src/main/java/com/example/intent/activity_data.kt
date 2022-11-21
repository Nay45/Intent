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

        val btnBack : Button = findViewById(R.id.btn_back)
        btnBack.setOnClickListener(this)

    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.choose1 ->
                    if (checked) {

                    }

                R.id.choose2 ->
                    if (checked) {

                    }

                R.id.choose3 ->
                    if (checked) {

                    }

                R.id.choose4 ->
                    if (checked) {

                    }
            }
        }
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