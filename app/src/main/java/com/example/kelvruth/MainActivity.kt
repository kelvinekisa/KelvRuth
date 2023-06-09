package com.example.kelvruth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

private lateinit var username: EditText
private lateinit var password: EditText
private lateinit var button: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.edtUsername)
        password = findViewById(R.id.edtPassword)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val username = username.text.toString()
            val password = password.text.toString()

            // Check if the username and password are valid
            if (isValidUsername(username) && isValidPassword(password)) {
                // TODO: Perform login action
        }else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
        }


            fun isValidUsername(username: String): Boolean {
                // TODO: Implement username validation logic
                return !TextUtils.isEmpty(username)
            }

            fun isValidPassword(password: String): Boolean {
                // TODO: Implement password validation logic
                return !TextUtils.isEmpty(password)
            }
            }
        }
    }













