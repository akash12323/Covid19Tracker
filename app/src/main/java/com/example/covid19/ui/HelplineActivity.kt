package com.example.covid19.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebViewClient
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.covid19.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.include_helpline.*
import kotlinx.android.synthetic.main.navigationdrawer.*

class HelplineActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helpline)

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

        val url = "file:///android_asset/helplibneCovid.html"

        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
        webView.webViewClient = WebViewClient()

    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        }
        else{
            super.onBackPressed()
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
            R.id.shop ->{
                startActivity(Intent(this, ShopActivity::class.java))
            }
            R.id.test ->{
                startActivity(Intent(this, TestActivity::class.java))
            }
//            R.id.helpline ->{
//                startActivity(Intent(this,
//                    HelplineActivity::class.java))
//            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
