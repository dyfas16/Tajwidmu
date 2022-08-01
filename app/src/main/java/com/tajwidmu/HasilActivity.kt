package com.tajwidmu

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tajwidmu.databinding.ActivityHasilBinding

class HasilActivity : AppCompatActivity() {
    private var _binding: ActivityHasilBinding? = null
    private val binding get() = _binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val username = intent.getStringExtra(Constants.USER_NAME)
        binding?.tvName?.text = username
        val totalPertanyaan = intent.getIntExtra(Constants.TOTAL_PERTANYAAN,0 )
        val trueReply = intent.getIntExtra(Constants.TRUE_REPLY, 0)

        binding?.tvNilai?.text = "$trueReply dari $totalPertanyaan"

        binding?.btnSelesai?.setOnClickListener {
            startActivity(Intent(this, Menu::class.java))
            finish()
        }
    }
}