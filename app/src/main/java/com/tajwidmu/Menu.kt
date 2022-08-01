package com.tajwidmu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.TextView

class Menu : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnPlay: TextView = findViewById(R.id.btn_play)
        btnPlay.setOnClickListener(this)

        val btnMateri: TextView = findViewById(R.id.btn_materi)
        btnMateri.setOnClickListener(this)

        val btnAbout: TextView = findViewById(R.id.btn_about)
        btnAbout.setOnClickListener(this)

        val btnExit: TextView = findViewById(R.id.btn_exit)
        btnExit.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when (v.id) {
            R.id.btn_play -> {
                val moveIntent = Intent(this@Menu, MainActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_materi -> {
                val moveIntent = Intent(this@Menu, Materi::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_about -> {
                val moveIntent = Intent(this@Menu, About::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_exit -> {
                finish();
                System.exit(0)
            }
        }
    }
}