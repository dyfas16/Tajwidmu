package com.tajwidmu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import com.tajwidmu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnStart?.setOnClickListener {

            if (binding?.etName?.text.toString().isEmpty()) {
                Toast.makeText(
                    this,
                    "Masukan Namamu Dulu Ya!", Toast.LENGTH_SHORT
                ).show()
            } else {
                val intent = Intent (this, PertanyaanActivity::class.java)
                intent.putExtra(Constants.USER_NAME, binding?.etName?.text.toString())
                startActivity(intent)
                finish()
            }

        }
    }
}


