package com.beyza.seekbarslider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beyza.seekbarslider.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        click()
    }

    private fun click() {
        binding.circle1.setOnClickListener {
            default()
            binding.circle1.layoutParams.height
            binding.circle1.setBackgroundResource(R.drawable.circle_1)
        }
        binding.circle2.setOnClickListener {
            default()
            binding.circle1.setBackgroundResource(R.drawable.circle)
            binding.circle2.setBackgroundResource(R.drawable.circle_2)
            binding.line5.setBackgroundResource(R.drawable.line_2)
        }
        binding.circle3.setOnClickListener {
            default()
            binding.circle1.setBackgroundResource(R.drawable.circle)
            binding.circle3.setBackgroundResource(R.drawable.circle_2)
            binding.line3.setBackgroundResource(R.drawable.line_2)
        }
        binding.circle4.setOnClickListener {
            default()
            binding.circle4.setBackgroundResource(R.drawable.circle_3)
            binding.circle3.setBackgroundResource(R.drawable.circle_blue)
            binding.circle1.setBackgroundResource(R.drawable.circle)
            binding.line3.setBackgroundResource(R.drawable.line_3)
            binding.line4.setBackgroundResource(R.drawable.line_3)
        }
        binding.circle5.setOnClickListener {
            default()
            binding.circle5.setBackgroundResource(R.drawable.circle_3)
            binding.circle2.setBackgroundResource(R.drawable.circle_blue)
            binding.circle1.setBackgroundResource(R.drawable.circle)

            binding.line5.setBackgroundResource(R.drawable.line_3)
            binding.line2.setBackgroundResource(R.drawable.line_3)
        }
        binding.circle6.setOnClickListener {
            default()
            binding.circle6.setBackgroundResource(R.drawable.circle_4)
            binding.circle4.setBackgroundResource(R.drawable.circle_dark_blue)
            binding.circle3.setBackgroundResource(R.drawable.circle_dark_blue)
            binding.circle1.setBackgroundResource(R.drawable.circle)
            binding.line.setBackgroundResource(R.drawable.line_4)
            binding.line3.setBackgroundResource(R.drawable.line_4)
            binding.line4.setBackgroundResource(R.drawable.line_4)
        }
        binding.circle7.setOnClickListener {
            default()
            binding.circle7.setBackgroundResource(R.drawable.circle_4)
            binding.circle5.setBackgroundResource(R.drawable.circle_dark_blue)
            binding.circle2.setBackgroundResource(R.drawable.circle_dark_blue)
            binding.circle1.setBackgroundResource(R.drawable.circle)
            binding.line5.setBackgroundResource(R.drawable.line_4)
            binding.line2.setBackgroundResource(R.drawable.line_4)
            binding.line6.setBackgroundResource(R.drawable.line_4)
        }
    }

    private fun default() {
        binding.circle1.setBackgroundResource(R.drawable.circle)
        binding.circle2.setBackgroundResource(R.drawable.circle)
        binding.circle3.setBackgroundResource(R.drawable.circle)
        binding.circle4.setBackgroundResource(R.drawable.circle)
        binding.circle5.setBackgroundResource(R.drawable.circle)
        binding.circle6.setBackgroundResource(R.drawable.circle)
        binding.circle7.setBackgroundResource(R.drawable.circle)
        binding.line.setBackgroundResource(R.drawable.line)
        binding.line2.setBackgroundResource(R.drawable.line)
        binding.line3.setBackgroundResource(R.drawable.line)
        binding.line4.setBackgroundResource(R.drawable.line)
        binding.line5.setBackgroundResource(R.drawable.line)
        binding.line6.setBackgroundResource(R.drawable.line)
    }


}
