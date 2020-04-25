package com.example.covid19.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.covid19.R
import com.example.covid19.ui.fragment.HomeFragment
import com.example.covid19.ui.fragment.InfoFragment
import com.example.covid19.ui.fragment.NewsFragment
import com.example.covid19.ui.fragment.PrecautionsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navigationdrawer.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.navigationdrawer)

        setSupportActionBar(toolbar1)

        val toogle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar1,
            R.string.open,
            R.string.close
        )

        drawer.addDrawerListener(toogle)
        toogle.syncState()

        navView.setNavigationItemSelectedListener(this)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame,HomeFragment())
            .commit()

        bottom_nav.setOnNavigationItemSelectedListener (navSelector)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
//            R.id.home->{
//                startActivity(Intent(this,MainActivity::class.java))
//            }
            R.id.utilities->{
                startActivity(Intent(this, UtilitiesActivity::class.java))
            }
            R.id.about->{
//                startActivity(Intent(this,AboutUsActivity::class.java))
            }
            R.id.shop->{
                startActivity(Intent(this, ShopActivity::class.java))
            }
            R.id.test->{
                startActivity(Intent(this, TestActivity::class.java))
            }
            R.id.helpline->{
                startActivity(Intent(this,
                    HelplineActivity::class.java))
            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
