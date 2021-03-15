package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView     // data  member


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
       // val testResult: TextView = findViewById(R.id.text_result)
        rollButton.setOnClickListener{rollDice()} // lambda exp
    }
    private fun rollDice() {
       // Toast.makeText(context:this, text:"button clicked", Toast.LENGTH_SHORT) .show()
        //chaining call
       // val textResult: TextView = findViewById(R.id.text_result)

        val randomInt = (1..6).random()
        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else  -> R.drawable.dice_6
        }
        // set image source to imageView
        diceImage.setImageResource(drawableResource)

        //textResult.text = randomInt.toString()


    }
}