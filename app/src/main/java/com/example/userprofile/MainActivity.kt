package com.example.userprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private  lateinit var btnReg:Button
class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnReg =findViewById(R.id.btnReg)
        btnReg.setOnClickListener{
            intent = Intent(this,Register::class.java)
            startActivity(intent)
        }


    }
}