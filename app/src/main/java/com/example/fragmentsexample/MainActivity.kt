package com.example.fragmentsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeBtn: Button = findViewById(R.id.home_btn)
        val profileBtn: Button = findViewById(R.id.profile_btn)
        val settingBtn: Button = findViewById(R.id.setting_btn)
        val sendToProfileButton: Button = findViewById(R.id.send_to_profile_button)
        val enterNameEditText: EditText = findViewById(R.id.enter_name)

        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment()
        val settingFragment = SettingFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.body_fragment, homeFragment)
            commit()
        }

        homeBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.body_fragment, homeFragment)
                commit()
            }
        }

        profileBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.body_fragment, profileFragment)
                commit()
            }
        }

        settingBtn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.body_fragment, settingFragment)
                commit()
            }
        }

        sendToProfileButton.setOnClickListener {
            val input_name: String = enterNameEditText.editableText.toString()
            val args = Bundle()
            args.putString("name", input_name)
            profileFragment.arguments = args
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.body_fragment, profileFragment)
                commit()
            }
        }


    }
}