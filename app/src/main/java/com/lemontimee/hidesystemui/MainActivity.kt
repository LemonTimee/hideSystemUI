package com.lemontimee.hidesystemui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //system UI hiding when activity created.
        hideSystemUI()
    }

    //if user press home button or quit app, onCreate won't get called (onResume also usable).
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            hideSystemUI()
        }
    }
}