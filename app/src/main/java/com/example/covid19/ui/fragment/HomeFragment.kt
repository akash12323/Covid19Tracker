package com.example.covid19.ui.fragment


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19.R
import com.example.covid19.data.api.Client
import com.example.covid19.data.res.totalresponse.StatewiseItem
import com.example.covid19.ui.adapter.CountryAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    val list = arrayListOf<StatewiseItem>()
    val countryadapter = CountryAdapter(list)

    val country = "India"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        view.mainRv.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
            adapter = countryadapter
        }

        countryadapter.onItemClick = {
            Toast.makeText(context,"country",Toast.LENGTH_SHORT).show()
        }

        GlobalScope.launch {
            val response = withContext(Dispatchers.IO){Client.api2.getAllIndiaCases()}
            if (response.isSuccessful){
                response.body()?.let { res->
                    res.statewise?.let {
                        list.addAll(it) }
                    activity!!.runOnUiThread{countryadapter.notifyDataSetChanged()}
                }
            }
        }

        GlobalScope.launch {
            val response = withContext(Dispatchers.IO){ Client.api2.getAllIndiaCases() }

            if (response.isSuccessful){
                response.body()?.let { res->

                    res.let { Log.i("abc",it.toString()) }

                    activity!!.runOnUiThread {
                        confirmed.text = res.statewise?.get(0)?.confirmed.toString()
                        active.text = res.statewise?.get(0)?.active.toString()
                        deceased.text = res.statewise?.get(0)?.deaths.toString()
                        recovered.text = res.statewise?.get(0)?.recovered.toString()
                    }
                }
            }
        }

        return view
    }

}
