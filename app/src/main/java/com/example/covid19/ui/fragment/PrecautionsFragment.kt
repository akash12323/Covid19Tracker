package com.example.covid19.ui.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19.R
import com.example.covid19.data.res.Advice
import com.example.covid19.ui.adapter.AdviceAdapter
import com.example.covid19.ui.adapter.PagerAdapterInfo
import com.example.covid19.ui.adapter.PagerAdapterPrecautions
import kotlinx.android.synthetic.main.fragment_precautions.*
import kotlinx.android.synthetic.main.fragment_precautions.view.*


/**
 * A simple [Fragment] subclass.
 */
class PrecautionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_precautions, container, false)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val fragmentAdapter = PagerAdapterPrecautions(childFragmentManager)
        viewPager.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(viewPager) //this line will set our tabLayout with viewPager

    }

}
