package com.tajwidmu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    companion object{

        const val DATA_TAJWID = "data_tajwid"
    }

    private lateinit var tvName: TextView
    private lateinit var tvDetail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        tvName = findViewById(R.id.tv_detail_name)
        tvDetail = findViewById(R.id.tv_item_detail)

        val dataTajwid = intent.getParcelableExtra<Tajwid>(DATA_TAJWID) as Tajwid

        tvName.text = dataTajwid.name
        tvDetail.text = dataTajwid.detail

        supportActionBar?.title = dataTajwid.name
    }
}