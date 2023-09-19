package com.example.s_week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupactivity)

        //pwd 블러처리
        val signupwd: EditText = findViewById(R.id.signupwd)
        signupwd.transformationMethod = PasswordTransformationMethod.getInstance()

        val signup_bt : Button = findViewById(R.id.signup_bt)

        signup_bt.setOnClickListener{
           // val signupname: EditText = findViewById(R.id.signupname)
           // val input_singupname = signupname.text.toString()
            val signupid : EditText = findViewById(R.id.signupid)
            val input_signupid = signupid.text.toString()
            val signupwd : EditText = findViewById(R.id.signupwd)
            val input_signupwd = signupwd.text.toString()

            val intent = Intent(this,SignInActivity::class.java)
            intent.putExtra("user_id",input_signupid)
            intent.putExtra("user_pwd",input_signupwd)
            Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
            startActivity(intent)



        }




    }
}
