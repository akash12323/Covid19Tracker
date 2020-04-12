package com.example.covid19.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.covid19.R
import com.example.covid19.ui.fragment.HomeFragment
import com.example.covid19.ui.fragment.InfoFragment
import com.example.covid19.ui.fragment.NewsFragment
import com.example.covid19.ui.fragment.PrecautionsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager

    private val navSelector = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.home ->{
                manager.beginTransaction().replace(
                    R.id.frame,
                    HomeFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.news ->{
                manager.beginTransaction().replace(
                    R.id.frame,
                    NewsFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.info ->{
                manager.beginTransaction().replace(
                    R.id.frame,
                    InfoFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.precautions ->{
                val transaction = manager.beginTransaction()
                transaction.replace(
                    R.id.frame,
                    PrecautionsFragment()
                ).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
//    addToBackStack(null).

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame,HomeFragment())
            .commit()

        bottom_nav.setOnNavigationItemSelectedListener (navSelector)

    }
}
