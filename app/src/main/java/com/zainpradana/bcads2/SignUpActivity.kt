package com.zainpradana.bcads2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btn_sign_up.setOnClickListener {
            finish()
            startActivity(Intent(this, HomeActivity::class.java))
        }

        tv_sign_in.setOnClickListener {
            finish()
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}