package com.example.frescodemo

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.rotationMatrix
import androidx.core.util.toAndroidXPair
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import com.example.frescodemo.databinding.ActivityMainBinding
import java.text.Bidi
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //  setContentView(R.layout.activity_main)


        with(binding) {
            btnPlayer1.setOnClickListener {
                markRainbowplayer1()
            }
        }

        with(binding) {
            btnPlayer2.setOnClickListener {
                markRainbowplayer2()
            }
        }


    }

    private fun markRainbowplayer2() {
        val hashPictures: HashMap<String, String> = HashMap()
        hashPictures["Tejas"] = "" + R.drawable.marnus
        hashPictures["Olga"] = "" + R.drawable.olga
        hashPictures["Anna"] = "" + R.drawable.anna
        hashPictures["Devil"] = "" + R.drawable.rob
        hashPictures["Gabby"] = "" + R.drawable.gabby
        hashPictures["Elf"] = "" + R.drawable.elf

        for (key in hashPictures.keys) {
            val random = Random
            val i: Int = random.nextInt(hashPictures.size)
            val picture = hashPictures.toList()[i]
            binding.txtName.text = picture.first
            binding.player2Image.setImageResource(picture.second.toIntOrNull() ?: 0)
        }

        binding.btnPlayer2.text = "Shoot"
    }


    private fun markRainbowplayer1() {
        val hashPictures: HashMap<String, String> = HashMap()
        hashPictures["Tejas"] = "" + R.drawable.marnus
        hashPictures["Olga"] = "" + R.drawable.olga
        hashPictures["Anna"] = "" + R.drawable.anna
        hashPictures["Devil"] = "" + R.drawable.rob
        hashPictures["Gabby"] = "" + R.drawable.gabby
        hashPictures["Elf"] = "" + R.drawable.elf

        for (key in hashPictures.keys) {
            val random = Random
            val i: Int = random.nextInt(hashPictures.size)
            val picture = hashPictures.toList()[i]
            binding.txtName.text = picture.first
            binding.player1Image.setImageResource(picture.second.toIntOrNull() ?: 0)
        }
        binding.btnPlayer1.text = "Shoot"
    }

    //Creating a logic for fight between Apple and cherry

    private fun createFight() {
              binding.txtName.visibility = View.GONE
              binding.txtName2.visibility = View.GONE



        }
    }


