package com.example.practiceprojectunit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener() {

            roll()
        }
    }

    fun roll(){
       val diceClassObj = Dice(6)
        val textViewObj :TextView = findViewById(R.id.textView)
        textViewObj.text = diceClassObj.number.toString()
        val imageViewObj : ImageView = findViewById(R.id.imageView)
        when (diceClassObj.number){

            1->      imageViewObj.setImageResource(R.drawable.dice_1)
            2->      imageViewObj.setImageResource(R.drawable.dice_2)
            3->      imageViewObj.setImageResource(R.drawable.dice_3)
            4->      imageViewObj.setImageResource(R.drawable.dice_4)
            5->      imageViewObj.setImageResource(R.drawable.dice_5)
            6->      imageViewObj.setImageResource(R.drawable.dice_6)
        }

    }

    

    class Dice (range : Int){
        val rangeDice: IntRange = 1..range
        val  number = rangeDice.random()
    }


}

