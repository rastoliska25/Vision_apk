package com.example.visiontest

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.matematika.*


class Kala : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.matematika)

        val sound = MediaPlayer.create(this, R.raw.sound2)
        sound.start()

        var pole = arrayListOf<Long>()


        object : CountDownTimer(160000,100){   // prvá fáza
            override fun onFinish() {
                x2.setText("VISION")
            }

         override fun onTick(millisUntilFinished: Long) {

             for (o in 0..100) {
             var q = (100000000000000000..500000000000000000).random()
               pole.add(q)
             }

            val y=(0..100).random()
             x1.setText(pole[y].toString())

             val y2=(0..100).random()
             x5.setText(pole[y2].toString())

             val y3=(0..100).random()
             x9.setText(pole[y3].toString())

             val y4=(0..100).random()
             x13.setText(pole[y4].toString())

             val y5=(0..100).random()
             x17.setText(pole[y5].toString())

      }

        }.start()



        object : CountDownTimer(160000,90){       //fáza 2
            override fun onFinish() {
                x2.setText("VISION")
            }

            override fun onTick(millisUntilFinished: Long) {

                for (o in 0..100) {
                    var q = (100000000000000000..500000000000000000).random()
                    pole.add(q)
                }

                val y=(0..100).random()
                x2.setText(pole[y].toString())

                val y2=(0..100).random()
                x6.setText(pole[y2].toString())

                val y3=(0..100).random()
                x10.setText(pole[y3].toString())

                val y4=(0..100).random()
                x14.setText(pole[y4].toString())

                val y5=(0..100).random()
                x18.setText(pole[y5].toString())

            }

        }.start()


        object : CountDownTimer(160000,110){   //fáza 3
            override fun onFinish() {
                x2.setText("VISION")
            }

            override fun onTick(millisUntilFinished: Long) {

                for (o in 0..100) {
                    var q = (100000000000000000..500000000000000000).random()
                    pole.add(q)
                }

                val y=(0..100).random()
                x3.setText(pole[y].toString())

                val y2=(0..100).random()
                x7.setText(pole[y2].toString())

                val y3=(0..100).random()
                x11.setText(pole[y3].toString())

                val y4=(0..100).random()
                x15.setText(pole[y4].toString())

                val y5=(0..100).random()
                x19.setText(pole[y5].toString())

            }

        }.start()



        object : CountDownTimer(160000,80){       //  fáza 4
            override fun onFinish() {
                x2.setText("VISION")
            }

            override fun onTick(millisUntilFinished: Long) {

                for (o in 0..100) {
                    var q = (100000000000000000..500000000000000000).random()
                    pole.add(q)
                }

                val y=(0..100).random()
                x4.setText(pole[y].toString())

                val y2=(0..100).random()
                x8.setText(pole[y2].toString())

                val y3=(0..100).random()
                x12.setText(pole[y3].toString())

                val y4=(0..100).random()
                x16.setText(pole[y4].toString())

                val y5=(0..100).random()
                x20.setText(pole[y5].toString())

            }

        }.start()


        nazad2.setOnClickListener {
            setContentView(R.layout.activity_main)
            sound.stop()
            val zz = Intent(this, MainActivity::class.java)
            startActivity(zz)

        }

    }


}