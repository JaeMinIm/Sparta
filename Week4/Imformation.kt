package com.example.s_week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Imformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.impormation)

        val intent = intent
        val input_id = intent.getStringExtra("login_id")

        val impor_id : EditText = findViewById(R.id.impor_id)
        impor_id.setText(input_id)

        val end_bt : Button = findViewById(R.id.end_bt)

        end_bt.setOnClickListener{
            finish()
        }






    }
}
