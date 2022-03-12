package com.ymo.android_ui_design_prototype

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import com.ymo.android_ui_design_prototype.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpUIs();
    }

    private fun setUpUIs() {
        binding.tvByRoom.setOnClickListener {
            with(binding) {
                tvByRoom.background =
                    ContextCompat.getDrawable(applicationContext, R.drawable.bg_full_text_color)
                tvByRates.background =
                    ContextCompat.getDrawable(applicationContext, R.drawable.bg_border_text_color)
                tvByRoom.setPadding(35)
                tvByRates.setPadding(35)
                byRoomLayout.visibility= View.VISIBLE
                byRatesLayout.visibility= View.GONE
            }
        }
        binding.tvByRates.setOnClickListener {
            with(binding) {
                tvByRates.background =
                    ContextCompat.getDrawable(applicationContext, R.drawable.bg_full_text_color)
                tvByRoom.background =
                    ContextCompat.getDrawable(applicationContext, R.drawable.bg_border_text_color)
                tvByRoom.setPadding(35)
                tvByRates.setPadding(35)
                byRatesLayout.visibility= View.VISIBLE
                byRoomLayout.visibility= View.GONE
            }
        }
    }

}