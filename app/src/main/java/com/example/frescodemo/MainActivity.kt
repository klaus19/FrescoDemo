package com.example.frescodemo

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.TranslateAnimation
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
         markRainbowplayer1()
        markRainbowplayer2()

        binding.btnPlayer1.setOnClickListener {
            transitionGame()
        }

        binding.btnPlayer2.setOnClickListener {
            transitionGame2()
        }


    }


    private fun transitionGame() {
        with(binding){
            ObjectAnimator.ofFloat(token1Image,"translationY",175f).apply {
                duration =200
                start()
            }
        }
    }

    private fun transitionGame2() {
        with(binding){
            ObjectAnimator.ofFloat(token2Image,"translationY",-175f).apply {
                duration =200
                start()
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
            binding.txtName1Player.text = picture.first
            binding.player2Image.setImageResource(picture.second.toIntOrNull() ?: 0)
        }


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
            binding.txtName2.text = picture.first
            binding.player1Image.setImageResource(picture.second.toIntOrNull() ?: 0)
        }

    }

    //Creating a logic for fight between Apple and cherry

    private fun createFight() {

         val game:HashMap<String, String> = HashMap()
        game["Rock"] = ""+R.drawable.rock
        game["Paper"]= ""+R.drawable.paper
        game["Scissor"] = ""+R.drawable.scissors

        for (key in game.keys) {
            val random = Random
            val j:Int = random.nextInt(game.size)
            val pic = game.toList()[j]

        }

        }
    }


