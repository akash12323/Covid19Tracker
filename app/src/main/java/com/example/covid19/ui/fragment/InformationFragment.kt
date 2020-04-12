package com.example.covid19.ui.fragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.covid19.R
import com.example.covid19.ui.WebActivity
import kotlinx.android.synthetic.main.fragment_information.view.*

/**
 * A simple [Fragment] subclass.
 */
class InformationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_information, container, false)

        view.cv1.setOnClickListener {
            val i = Intent(context, WebActivity::class.java)
            i.putExtra("url","https://www.mohfw.gov.in/")
            activity?.startActivity(i)
        }
        view.cv2.setOnClickListener {
            val i = Intent(context, WebActivity::class.java)
            i.putExtra("url","https://www.who.int/emergencies/diseases/novel-coronavirus-2019")
            activity?.startActivity(i)
        }
        view.cv3.setOnClickListener {
            val i = Intent(context, WebActivity::class.java)
            i.putExtra("url","https://www.worldometers.info/coronavirus/")
            activity?.startActivity(i)
        }

        return view
    }


}
