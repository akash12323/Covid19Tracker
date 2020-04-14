package com.example.covid19.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.covid19.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : FragmentActivity(),OnMapReadyCallback {

    lateinit var  map : GoogleMap

    lateinit var latt:String
    lateinit var lngg:String
    lateinit var titlee:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val lat = intent.getStringExtra("lat")
        val lng = intent.getStringExtra("lng")
        val title = intent.getStringExtra("title")

        latt = lat
        lngg = lng
        titlee = title

        var mapFragment:SupportMapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap?) {
        map = p0!!

        val coord = LatLng(latt.toDouble(),lngg.toDouble())
        map.addMarker(MarkerOptions().position(coord).title(titlee.toString()))
        map.moveCamera(CameraUpdateFactory.newLatLng(coord))
    }
}
