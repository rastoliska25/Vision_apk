package com.example.visiontest




import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_a_c2.*
import kotlinx.android.synthetic.main.activity_main.*


class AC2 : AppCompatActivity() {


    val pole = arrayOf(
        "Push yourself, because no one else is going to do it for you.",
        "Sometimes later becomes never. Do it now.",
        "Great things never come from comfort zones.",
        "Dream it. Wish it. Do it.",
        "Success doesn’t just find you. You have to go out and get it.",
        "The harder you work for something, the greater you’ll feel when you achieve it.",
        "Dream bigger. Do bigger.",
        "Don’t stop when you’re tired. Stop when you’re done.",
        "Wake up with determination. Go to bed with satisfaction.",
        "Do something today that your future self will thank you for.",
        "Little things make big days.",
        "It’s going to be hard, but hard does not mean impossible.",
        "Don’t wait for opportunity. Create it.",
        "Sometimes we’re tested not to show our weaknesses, but to discover our strengths.",
        "The key to success is to focus on goals, not obstacles.",
        "Dream it. Believe it. Build it.",
        "Never give up. Great things take time. Be patient.",
        "Look in the mirror. That’s your competition."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_c2)

        val sound = MediaPlayer.create(this, R.raw.sound2)
        sound.start()


        object : CountDownTimer(160000, 5000) {
            override fun onFinish() {
                kacka.setText("VISION")
            }

            var x = (0..17).random()
            override fun onTick(millisUntilFinished: Long) {


                kacka.setText(pole[x])
                x = x + 1
                if (x == 17) {
                    x = 0
                }
            }


        }.start()



        nazad.setOnClickListener {
            setContentView(R.layout.activity_main)
            sound.stop()
            val yy = Intent(this, MainActivity::class.java)
            startActivity(yy)


        }

    }

}


















