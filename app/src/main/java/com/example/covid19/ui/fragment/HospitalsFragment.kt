package com.example.covid19.ui.fragment


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.covid19.R
import kotlinx.android.synthetic.main.fragment_hospitals.*
import kotlinx.android.synthetic.main.fragment_hospitals.view.*

/**
 * A simple [Fragment] subclass.
 */
class HospitalsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hospitals, container, false)

        view.h1.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv1.text}"))
            activity?.startActivity(i)
        }
        view.h2.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv2.text}"))
            activity?.startActivity(i)
        }
        view.h3.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv3.text}"))
            activity?.startActivity(i)
        }
        view.h4.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv4.text}"))
            activity?.startActivity(i)
        }
        view.h5.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv5.text}"))
            activity?.startActivity(i)
        }
        view.h6.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv6.text}"))
            activity?.startActivity(i)
        }
        view.h7.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv7.text}"))
            activity?.startActivity(i)
        }
        view.h8.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv8.text}"))
            activity?.startActivity(i)
        }

        return view
    }

}
