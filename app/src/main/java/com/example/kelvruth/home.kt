package com.example.kelvruth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private lateinit var button_1: Button
private lateinit var button_2: Button



class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



//find login  and register by ID
        button_1 = findViewById(R.id.log_in)
        button_2 = findViewById(R.id.button_2)

        .setOnClickListener {
            // Handle login button click
            navigateToLogin()
        }

        button_2.setOnClickListener {
            // Handle register button click
            navigateToRegister()
        }
    }

//    private fun navigateToLogin() {
//        // Start the login activity
//        val intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
//    }
private fun navigateToLogin() {
    // Get the username and password entered by the user
    val username = "exampleUsername" // Replace with the actual code to get the username
    val password = "examplePassword" // Replace with the actual code to get the password

    // Perform login validation
    if (isValidUsername(username) && isValidPassword(password)) {
        // Login successful, navigate to the main screen
        val intent = Intent(this, signup::class.java)
        startActivity(intent)
        finish() // Optional: Close the current activity to prevent going back to it from the main screen
    } else {
        // Invalid login credentials, show an error message or toast
        Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
    }
}

    private fun isValidPassword(password: String): Boolean {


    }

    private fun isValidUsername(username: String): Boolean {
        // Add your validation logic here
        // For example, check if the username is not empty and meets certain criteria

        // Validate that the username is not empty
        if (username.isEmpty()) {
            return false
        }

        // Add more validation criteria if needed
        // For example, check if the username contains only alphanumeric characters

        // Regex pattern for alphanumeric characters
        val pattern = Regex("^[a-zA-Z0-9]+$")

        // Perform the regex match
        return pattern.matches(username)
    }


    private fun navigateToRegister() {
        // Start the register activity
        val intent = Intent(this, signup::class.java)
        startActivity(intent)
    }
}




