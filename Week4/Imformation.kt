package com.example.s_week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import kotlin.random.Random

class Imformation : AppCompatActivity() {

    val randomimage = arrayOf(
        R.drawable.main1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.impormation)

        randomImage()

        val intent = intent
        val input_id = intent.getStringExtra("login_id")

        val impor_id : EditText = findViewById(R.id.impor_id)
        impor_id.setText(input_id)

        val end_bt : Button = findViewById(R.id.end_bt)

        end_bt.setOnClickListener{
            finish()
        }
    }

    private fun randomImage() {
        val impor_image : ImageView = findViewById(R.id.impor_image)
        val randomindex = Random.nextInt(randomimage.size)
        val randomimageresource = randomimage[randomindex]
        impor_image.setImageResource(randomimageresource)
    }
}
