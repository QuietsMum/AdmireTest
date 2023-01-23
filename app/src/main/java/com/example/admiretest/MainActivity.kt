package com.example.admiretest

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //first variant is just use xml with lottie typing
        //second one is programmatically that is used above
        val animationView: LottieAnimationView = findViewById(R.id.animation_view)
        animationView.setAnimation(R.raw.lottie_typing)
        animationView.repeatCount = ValueAnimator.INFINITE
        animationView.playAnimation()
        //both variants are tested and working!
    }
}