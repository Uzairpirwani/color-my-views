package com.example.colormyviews
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setListners()
    }

    private fun setListners() {
        val Clickableviews: List<View> = listOf(binding.boxOne,binding.boxTwo,binding.box3,binding.box4,binding.box5,binding.redButton,binding.yellowButton2,binding.greenButton)
        for (item in Clickableviews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> binding.box3.setBackgroundColor(R.color.red)
            R.id.yellow_button2 -> binding.box4.setBackgroundColor(R.color.yellow)
            R.id.green_button -> binding.box5.setBackgroundColor(R.color.green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}


