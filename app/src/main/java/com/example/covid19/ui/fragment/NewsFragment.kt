package com.example.covid19.ui.fragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19.ui.NewsDetailActivity
import com.example.covid19.R
import com.example.covid19.data.api.Client
import com.example.covid19.ui.adapter.HealthAdapter
import com.example.newsforum.data.res.health.HealthArticlesItem
import kotlinx.android.synthetic.main.fragment_news.*
import kotlinx.android.synthetic.main.fragment_news.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment() {

    val healthlist = arrayListOf<HealthArticlesItem>()
    val healthadapter = HealthAdapter(healthlist)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_news, container, false)

        view.recyclerView.apply {
            layoutManager = LinearLayoutManager(context,
                RecyclerView.VERTICAL,false)
            adapter = healthadapter
        }
        healthadapter.onItemClick = {
            val i = Intent(context,
                NewsDetailActivity::class.java)
            i.putExtra("title",it.title.toString())
            i.putExtra("author",it.author.toString())
            i.putExtra("urlToImage",it.urlToImage.toString())
            i.putExtra("desc",it.description.toString())
            i.putExtra("source",it.source?.name.toString())
            i.putExtra("url",it.url.toString())
            i.putExtra("publishedAt",it.publishedAt.toString())
            i.putExtra("content",it.content.toString())
            startActivity(i)
        }

        GlobalScope.launch {
            val response = withContext(Dispatchers.IO){ Client.api.getHealthNews("in","health") }

            if (response.isSuccessful){
                response.body()?.let {res->
                    res.articles?.let { healthlist.addAll(it) }
                    activity!!.runOnUiThread { healthadapter.notifyDataSetChanged()
                    ll1.visibility = View.GONE
                    item.visibility = View.VISIBLE
                    }
                }
            }
        }

        return view
    }


}
