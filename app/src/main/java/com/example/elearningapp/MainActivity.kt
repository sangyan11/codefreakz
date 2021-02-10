package com.example.elearningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"

    }

    fun ccppButton(view: View) {
        val intent = Intent(this,ccpppage::class.java)
        startActivity(intent)
    }

    fun javaButton(view: View) {
        val intent = Intent(this,java::class.java)
        startActivity(intent)
    }

    fun pythonButton(view: View) {
        val intent = Intent(this,python::class.java)
        startActivity(intent)
    }

    fun androiddevelopmentButton(view: View) {
        val intent = Intent(this,androiddevelopment::class.java)
        startActivity(intent)
    }

    fun webdevelopmentButton(view: View) {
        val intent = Intent(this,webdevelopment::class.java)
        startActivity(intent)
    }

}


