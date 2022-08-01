package com.tajwidmu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Materi : AppCompatActivity() {
    private lateinit var rvTajwid: RecyclerView
    private var list: ArrayList<Tajwid> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

        rvTajwid = findViewById(R.id.rv_tajwid)


        list.addAll(TajwidData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {

        val listHeroAdapter = ListTajwidAdapter(list)


        rvTajwid.apply {
            layoutManager =LinearLayoutManager(this@Materi)
            adapter = listHeroAdapter
        }

        listHeroAdapter.setOnItemClickCallBack(object : ListTajwidAdapter.OnClickCallBack{
            override fun clickDetail(tajwid: Tajwid){

                val sendData = Intent(this@Materi, DetailActivity::class.java)
                sendData.putExtra(DetailActivity.DATA_TAJWID, tajwid)
                startActivity(sendData)
            }
        })
    }


}