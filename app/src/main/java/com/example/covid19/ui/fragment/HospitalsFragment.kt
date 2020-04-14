package com.example.covid19.ui.fragment


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.covid19.ui.MapsActivity
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

        view.tv1.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv1.text}"))
            activity?.startActivity(i)
        }
        view.tv2.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv2.text}"))
            activity?.startActivity(i)
        }
        view.tv3.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv3.text}"))
            activity?.startActivity(i)
        }
        view.tv4.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv4.text}"))
            activity?.startActivity(i)
        }
        view.tv5.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv5.text}"))
            activity!!.startActivity(i)
        }
        view.tv6.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv6.text}"))
            activity?.startActivity(i)
        }
        view.tv7.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv7.text}"))
            activity?.startActivity(i)
        }
        view.tv8.setOnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${tv8.text}"))
            activity?.startActivity(i)
        }


        view.t5.setOnClickListener {
            val i = Intent(context, MapsActivity::class.java)

            i.putExtra("lat","28.7148")
            i.putExtra("lng","77.1136")
            i.putExtra("title","Dr Baba Saheb Ambedkar Hospital")

            activity?.startActivity(i)
        }
        view.t1.setOnClickListener {
            val i = Intent(context, MapsActivity::class.java)

            i.putExtra("lat","28.6391")
            i.putExtra("lng","77.2377")
            i.putExtra("title","Lok Nayak Hospital")

            activity?.startActivity(i)
        }
        view.t2.setOnClickListener {
            val i = Intent(context, MapsActivity::class.java)

            i.putExtra("lat","28.6892")
            i.putExtra("lng","77.3165")
            i.putExtra("title","Rajiv Gandhi Super Speciality Hospital")

            activity?.startActivity(i)
        }
        view.t3.setOnClickListener {
            val i = Intent(context, MapsActivity::class.java)

            i.putExtra("lat","28.6840")
            i.putExtra("lng","77.3094")
            i.putExtra("title","Guru Tegh Bahadur Hospital")

            activity?.startActivity(i)
        }
        view.t4.setOnClickListener {
            val i = Intent(context, MapsActivity::class.java)

            i.putExtra("lat","28.6280")
            i.putExtra("lng","77.1121")
            i.putExtra("title","Deen Dayal Upadhayay Hospital")

            activity?.startActivity(i)
        }
        view.t6.setOnClickListener {
            val i = Intent(context, MapsActivity::class.java)

            i.putExtra("lat","28.6435")
            i.putExtra("lng","77.1873")
            i.putExtra("title","Sir Ganga Ram Kolmet Hospital")

            activity?.startActivity(i)
        }
        view.t7.setOnClickListener {
            val i = Intent(context, MapsActivity::class.java)

            i.putExtra("lat","28.5276")
            i.putExtra("lng","77.2121")
            i.putExtra("title","Max Super Speciality Hospital")

            activity?.startActivity(i)
        }
        view.t8.setOnClickListener {
            val i = Intent(context, MapsActivity::class.java)

            i.putExtra("lat","28.5406")
            i.putExtra("lng","77.2834")
            i.putExtra("title","Indraprastha Apollo Hospital")

            activity?.startActivity(i)
        }

        return view
    }

}
