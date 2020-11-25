package com.example.discord

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setSpannableString()

    }

    private fun setSpannableString() {
        val span = SpannableString("Forgot your password?")
        val clickableSpan = object : ClickableSpan(){
            override fun onClick(widget: View) {
                startActivity(Intent(this@LoginActivity,ForgotPassword::class.java))
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false
                ds.color = resources.getColor(R.color.discordblue)
            }

        }
        span.setSpan(clickableSpan,span.length-21,span.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        forgotPassword.text = span
        forgotPassword.movementMethod = LinkMovementMethod.getInstance()
        forgotPassword.isVisible = true
    }
}