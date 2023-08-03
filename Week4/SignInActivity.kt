package com.example.s_week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.text.method.PasswordTransformationMethod
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signinactivity)

        val login_bt: Button = findViewById(R.id.login_bt)

        login_bt.setOnClickListener{
            val signinid: TextView  = findViewById(R.id.signinid)
            val input_id = signinid.text.toString()
            val signinpwd: EditText = findViewById(R.id.signinpwd)
            //pwd 블러처리
            signinpwd.transformationMethod = PasswordTransformationMethod.getInstance()
            val input_pwd = signinpwd.text.toString()

           // Log.d("LoginActivity", "입력된 아이디: $input_id, 입력된 비밀번호: $input_pwd")

            if (input_id.trim().isEmpty()) {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
            } else if (input_pwd.trim().isEmpty()) {
                Toast.makeText(this, "아이디/비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, Imformation::class.java)
                intent.putExtra("message", "로그인 성공! 내정보 확인")
                intent.putExtra("login_id",input_id)
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }

        val intent = intent
        val input_signupid = intent.getStringExtra("user_id")
        val input_signupwd = intent.getStringExtra("user_pwd")
       // Log.d("LoginActivity", "전달받은 아이디: $input_signupid, 전달받은 비밀번호: $input_signupwd")


        val signinid : EditText = findViewById(R.id.signinid)
        signinid.setText(input_signupid)
        val signinpwd : EditText = findViewById(R.id.signinpwd)
        signinpwd.setText(input_signupwd)




        val signup_bt: Button = findViewById(R.id.signup_bt)

        signup_bt.setOnClickListener {

            val intent = Intent(this,SignUpActivity::class.java)
            intent.putExtra("message", "회원가입 페이지")
            startActivity(intent)
            //  Toast.makeText(this, "버튼이 클릭되었습니다!", Toast.LENGTH_SHORT).show()
        }
    }
}