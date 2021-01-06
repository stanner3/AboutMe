package com.teamtannerproductions.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HobbiesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val getFamilyButton = findViewById<Button>(R.id.family_button)
        getFamilyButton?.setOnClickListener {
            startFamilyScreen()
        }

        val getAboutButton = findViewById<Button>(R.id.about_me_button)
        getAboutButton?.setOnClickListener {
            startAboutMeScreen()
        }

        val getWorkButton = findViewById<Button>(R.id.work_button)
        getWorkButton?.setOnClickListener {
            startWorkButton()
        }
    }

    private fun startFamilyScreen() {
        val intent = Intent(this, FamilyActivity::class.java)
        startActivity(intent)
    }

    private fun startAboutMeScreen() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun startWorkButton() {
        val intent = Intent(this, WorkActivity::class.java)
        startActivity(intent)
    }


}