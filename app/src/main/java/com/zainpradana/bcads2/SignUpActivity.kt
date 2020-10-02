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
            back()
        }

        tv_sign_in.setOnClickListener {
            back()
        }
    }

    override fun onBackPressed() {
        back()
    }

    private fun back(){
        finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_in_out)
    }
}