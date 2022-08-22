package com.example.spotifake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navbar: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navbar = findViewById(R.id.bottomNavigationView)

        navbar.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.search -> setFragment(SearchFragment())
                R.id.home -> setFragment(HomeFragment())
                R.id.library -> setFragment(Library())
            }
            true
        }
    }

    private fun setFragment(f: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.fragmentContainerView, f)
        }
    }

}