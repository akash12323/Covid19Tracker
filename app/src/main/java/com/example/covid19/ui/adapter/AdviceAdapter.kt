package com.example.covid19.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19.R
import com.example.covid19.data.res.Advice
import kotlinx.android.synthetic.main.item_advice.view.*

class AdviceAdapter(val list: List<Advice>):
    RecyclerView.Adapter<AdviceAdapter.UserViewHolder>() {

    var onItemClick: ((user: Advice) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_advice,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(user: Advice) {
            itemView.apply {
                title.text = user.title
                subTitle.text = user.subtitle

                setOnClickListener{
                    onItemClick?.invoke(user)
                }
            }
        }
    }
}

