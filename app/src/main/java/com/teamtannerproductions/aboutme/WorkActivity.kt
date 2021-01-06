package com.teamtannerproductions.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WorkActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work)

        val getFamilyButton = findViewById<Button>(R.id.family_button)
        getFamilyButton?.setOnClickListener {
            startFamilyScreen()
        }

        val getAboutButton = findViewById<Button>(R.id.about_me_button)
        getAboutButton?.setOnClickListener {
            startAboutMeScreen()
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

    private fun startAboutMeScreen() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun startHobbiesButton() {
        val intent = Intent(this, HobbiesActivity::class.java)
        startActivity(intent)
    }


}