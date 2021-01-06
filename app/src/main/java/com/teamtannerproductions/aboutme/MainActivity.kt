package com.teamtannerproductions.aboutme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val getWorkButton = findViewById<Button>(R.id.work_button)
        getWorkButton?.setOnClickListener {
            startWorkButton()
        }

        val getFamilyButton = findViewById<Button>(R.id.family_button)
        getFamilyButton?.setOnClickListener {
            startFamilyScreen()
        }
        val getHobbiesButton = findViewById<Button>(R.id.hobbies_button)
        getHobbiesButton?.setOnClickListener {
            startHobbiesButton()
        }


    }

    private fun startFamilyScreen() {
        val intent = Intent(this, FamilyActivity::class.java)
        startActivity(intent)
    }

    private fun startWorkButton() {
        val intent = Intent(this, WorkActivity::class.java)
        startActivity(intent)
    }

    private fun startHobbiesButton() {
        val intent = Intent(this, HobbiesActivity::class.java)
        startActivity(intent)
    }

}