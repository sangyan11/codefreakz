package com.example.elearningapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*
import com.example.elearningapp.MainActivity

class RegisterActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_register)
            val btn = findViewById<TextView>(R.id.btnRegister)
            btn.setOnClickListener {
                if(
                    findViewById<EditText>(R.id.inputUsername).text.toString().isEmpty() ||
                    findViewById<EditText>(R.id.inputEmail).text.toString().isEmpty() ||
                    findViewById<EditText>(R.id.inputPassword).text.toString().isEmpty() ||
                    findViewById<EditText>(R.id.inputConformPassword).text.toString().isEmpty() )
                {
                    Toast.makeText(this,"Some field is missing", Toast.LENGTH_LONG).show()
                }
                else{
                    startActivity(
                        Intent(
                            this@RegisterActivity,
                            MainActivity::class.java
                        )
                    )
                }
            }
        }
}
