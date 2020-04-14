package com.example.covid19.ui.fragment


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.covid19.R
import com.example.covid19.ui.WebActivity
import kotlinx.android.synthetic.main.activity_news_detail.*
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.fragment_contact.view.*

/**
 * A simple [Fragment] subclass.
 */
class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_contact, container, false)

        view.cv1.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL,Uri.parse("tel:${tv1.text}"))
            activity?.startActivity(i)
        }

        view.tv2.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL,Uri.parse("tel:${tv2.text}"))
            activity?.startActivity(i)
        }
        view.t2.setOnClickListener {
            val i = Intent(context, WebActivity::class.java)
            i.putExtra("url","http://health.delhigovt.nic.in/wps/wcm/connect/DoIT_Health/health/home")
            activity?.startActivity(i)
        }

        return view
    }

}
