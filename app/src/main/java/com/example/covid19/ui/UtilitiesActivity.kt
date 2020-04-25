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
import kotlinx.android.synthetic.main.include_utility.*
import kotlinx.android.synthetic.main.navigationdrawer.*
import java.lang.Exception

class UtilitiesActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utilities)

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

        paytm.setOnClickListener {
            try {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm.com/helpinghand/pm-cares-fund")).apply {
                    setPackage("net.one97.paytm")
                }
                startActivity(i)
            }
            catch (e:Exception){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://paytm.com/helpinghand/pm-cares-fund"))
                startActivity(i)
            }
        }
        gpay.setOnClickListener {
            try {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://gpay.app.goo.gl/9bwXrr")).apply {
                    setPackage("com.google.android.apps")
                }
                startActivity(i)
            }
            catch (e:Exception){
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://gpay.app.goo.gl/9bwXrr"))
                startActivity(i)
            }
        }
        axis.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.axisbank.com/coronavirus-pm-cares-fund-donation"))
            startActivity(i)
        }
        pmnrf.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://pmnrf.gov.in/en/online-donation"))
            startActivity(i)
        }
        i1.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.meddo.in/covid"))
            startActivity(i)
        }
        i2.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.practo.com/health-checkup-packages/covid-19-sars-cov-2-detection/p?utm_source=referral&utm_campaign=coronavirus&utm_medium=social"))
            startActivity(i)
        }
        i3.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lalpathlabs.com/book-a-test/Delhi?utm_source=internal&utm_medium=home_page_banner&utm_campaign=covid-19"))
            startActivity(i)
        }
        i4.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://covid.thyrocare.com/covid-19.aspx"))
            startActivity(i)
        }
        i5.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/covid19/"))
            startActivity(i)
        }
        i6.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://intermountainhealthcare.org/covid19-coronavirus/covid19-symptom-checker/"))
            startActivity(i)
        }
        i7.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/symptoms-testing/index.html"))
            startActivity(i)
        }
        i8.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://covid.bhaarat.ai/workflow/5e7912eaab25b3cac1451628"))
            startActivity(i)
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home ->{
                startActivity(Intent(this, MainActivity::class.java))
            }
//            R.id.utilities ->{
//                startActivity(Intent(this, UtilitiesActivity::class.java))
//            }
            R.id.about ->{
//                startActivity(Intent(this,AboutUsActivity::class.java))
            }
            R.id.shop ->{
                startActivity(Intent(this, ShopActivity::class.java))
            }
            R.id.test ->{
                startActivity(Intent(this, TestActivity::class.java))
            }
            R.id.helpline ->{
                startActivity(
                    Intent(this,
                        HelplineActivity::class.java)
                )
            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
