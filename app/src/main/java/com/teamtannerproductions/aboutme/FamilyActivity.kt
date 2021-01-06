package com.teamtannerproductions.aboutme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FamilyActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)

        val getAboutButton = findViewById<Button>(R.id.about_me_button)
        getAboutButton?.setOnClickListener {
            startAboutMeScreen()
        }

        val getWorkButton = findViewById<Button>(R.id.work_button)
        getWorkButton?.setOnClickListener {
            startWorkButton()
        }

        val getHobbiesButton = findViewById<Button>(R.id.hobbies_button)
        getHobbiesButton?.setOnClickListener {
            startHobbiesButton()
        }
    }

    private fun startAboutMeScreen() {
        val intent = Intent(this, MainActivity::class.java)
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