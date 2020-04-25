package com.example.covid19.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.covid19.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.include_shop.*
import kotlinx.android.synthetic.main.navigationdrawer.*
import java.lang.Exception

class ShopActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

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

        cv1.setOnClickListener {
            try {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=Dettol+Handwash&ref=nb_sb_noss_2"))
                    .apply {
                        setPackage("in.amazon.mShop.android.shopping")
                    }
                startActivity(i)
            }
            catch (e:Exception){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=Dettol+Handwash&ref=nb_sb_noss_2"))
                startActivity(i)
            }
        }
        cv2.setOnClickListener {
            try {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=sanitizer&ref=nb_sb_noss_2"))
                    .apply {
                        setPackage("in.amazon.mShop.android.shopping")
                    }
                startActivity(i)
            }
            catch (e:Exception){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=sanitizer&ref=nb_sb_noss_2"))
                startActivity(i)
            }
        }
        cv3.setOnClickListener {
            try{
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=surgical+mask&ref=nb_sb_noss_2")).apply {
                    setPackage("in.amazon.mShop.android.shopping")
                }
                startActivity(i)
            }
            catch (e:Exception){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=surgical+mask&ref=nb_sb_noss_2"))
                startActivity(i)
            }
        }
        cv4.setOnClickListener {
            try {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/AABACO-SAFETY-PROTECTION-KITS-Protection/dp/B085HJDKZK/ref=sr_1_6?dchild=1&keywords=protection+kit&qid=1587742994&sr=8-6")).apply {
                    setPackage("in.amazon.mShop.android.shopping")
                }
                startActivity(i)
            }
            catch (e:Exception){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/AABACO-SAFETY-PROTECTION-KITS-Protection/dp/B085HJDKZK/ref=sr_1_6?dchild=1&keywords=protection+kit&qid=1587742994&sr=8-6"))
                startActivity(i)
            }
        }
        cv5.setOnClickListener {
            try {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Hand-Pro-Nitrile-Powder-free-Gloves/dp/B07LCFR6J1/ref=sr_1_2?dchild=1&keywords=protection+gloves&qid=1587743092&sr=8-2")).apply {
                    setPackage("in.amazon.mShop.android.shopping")
                }
                startActivity(i)
            }
            catch (e:Exception){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Hand-Pro-Nitrile-Powder-free-Gloves/dp/B07LCFR6J1/ref=sr_1_2?dchild=1&keywords=protection+gloves&qid=1587743092&sr=8-2"))
                startActivity(i)
            }
        }
        cv6.setOnClickListener {
            try {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=surface+disinfectants&crid=19ZO2R84KBJKK&sprefix=surface+disi%2Caps%2C289&ref=nb_sb_ss_i_5_12")).apply {
                    setPackage("in.amazon.mShop.android.shopping")
                }
                startActivity(i)
            }
            catch (e:Exception){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/s?k=surface+disinfectants&crid=19ZO2R84KBJKK&sprefix=surface+disi%2Caps%2C289&ref=nb_sb_ss_i_5_12"))
                startActivity(i)
            }
        }


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home ->{
                startActivity(Intent(this, MainActivity::class.java))
            }
            R.id.utilities ->{
                startActivity(Intent(this, UtilitiesActivity::class.java))
            }
            R.id.about ->{
//                startActivity(Intent(this,AboutUsActivity::class.java))
            }
//            R.id.shop ->{
//                startActivity(Intent(this, ShopActivity::class.java))
//            }
            R.id.test ->{
                startActivity(Intent(this, TestActivity::class.java))
            }
            R.id.helpline ->{
                startActivity(Intent(this,
                    HelplineActivity::class.java))
            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
//   dettol handwash
//    sanitizer alchohol based
//   surgical mask
//  protection kit
//  protection gloves
//  surface disinfectants

//btn6.setOnClickListener {

//}