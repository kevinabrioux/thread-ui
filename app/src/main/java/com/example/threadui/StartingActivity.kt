package com.example.threadui

import android.app.Activity
import android.os.Bundle
import android.view.WindowManager


class StartingActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val w = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        this.setContentView(R.layout.activity_starting)

    }
}