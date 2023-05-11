package com.example.userprofile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var etUsername: EditText
        var etPassword: EditText
        var btnRegister:Button
        var UsernameString:String
        var PasswordString:String


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername=findViewById(R.id.etRUserName)
        etPassword=findViewById(R.id.etRPassword)
        btnRegister= findViewById<Button>(R.id.btnRegister)

        /**btnRegister.setOnClickListener{
            UsernameString=etUsername.getText().toString()
            PasswordString=etPassword.getText().toString()
            Toast.makeText(this,UsernameString +"Successfully registered",Toast.LENGTH_SHORT).show()


        }**/

        

    }
}