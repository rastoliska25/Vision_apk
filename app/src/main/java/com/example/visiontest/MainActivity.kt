package com.example.visiontest

import android.content.Intent
import android.hardware.biometrics.BiometricPrompt
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_a_c2.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val pole = arrayOf("vision", "perseverance", "self-denial", "endurance", "strength", "energy", "future", "choice", "freedom","courage", "dreams", "style", "understanding", "possibilities", "hope", "victory", "faith", "idea")
    val pole2 = arrayOf("courage", "dreams", "style", "understanding", "possibilities", "hope", "victory", "faith", "idea","vision", "perseverance", "self-denial", "endurance", "strength", "energy", "future", "choice", "freedom" )
    var y=20


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val sound = MediaPlayer.create(this, R.raw.sound1)
        sound.start()


        tlacidlo.setOnClickListener{
            setContentView(R.layout.activity_a_c2)
            sound.stop()

        val xx = Intent(this, AC2::class.java)
            startActivity(xx)
        }

        tlacidlo2.setOnClickListener{
            setContentView(R.layout.matematika)
            sound.stop()

            val xy = Intent(this, Kala::class.java)
            startActivity(xy)
        }


        object : CountDownTimer(160000,1500){
            override fun onFinish() {
                pes.setText("VISION")
            }

                override fun onTick(millisUntilFinished: Long) {
                    var rozne = (0..17).random()
                    if (y == 20 || y!=rozne) {
                        y = rozne
                        pes.setText(pole[y])
                    }
                    else{
                        pes.setText(pole2[y])
                    }

                }


        }.start()
    }
}


