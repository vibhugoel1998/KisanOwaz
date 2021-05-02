package com.example.kisaanowaz

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        txtKisaanOWaaz.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.fadein))
        mRunnable = Runnable {
            startActivity(Intent(this, ChoiceActivity::class.java))
            finish()
        }
        mHandler = Handler()
        mHandler.postDelayed(mRunnable, 4000)
    }

    override fun onStop() {
        super.onStop()
        mHandler.removeCallbacks(mRunnable)
    }
}