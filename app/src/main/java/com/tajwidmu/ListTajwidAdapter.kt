package com.tajwidmu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListTajwidAdapter(val listTajwid: ArrayList<Tajwid>) : RecyclerView.Adapter<ListTajwidAdapter.TajwidAdapter>() {

    lateinit var onClickCallBack : OnClickCallBack

    fun setOnItemClickCallBack(onItemClickCallBack : OnClickCallBack){
        this.onClickCallBack = onItemClickCallBack
    }

    interface OnClickCallBack {
        fun clickDetail(tajwid: Tajwid)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListTajwidAdapter.TajwidAdapter {
        return TajwidAdapter(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row_tajwid,
                parent,
                false
            )
        )

    }

    override fun getItemCount(): Int = listTajwid.size



    override fun onBindViewHolder(holder: ListTajwidAdapter.TajwidAdapter, position: Int) {
        val tajwid = listTajwid[position]
        holder.bind(tajwid)

       holder.itemView.setOnClickListener {
           onClickCallBack.clickDetail(tajwid)
       }
    }





    inner class TajwidAdapter(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(tajwid: Tajwid) {

            with(itemView) {
                val tvName = findViewById<TextView>(R.id.tv_item_name)
                val tvDetail = findViewById<TextView>(R.id.tv_item_detail)
                tvName.text = tajwid.name
                tvDetail.text = tajwid.detail
            }
        }
    }

}