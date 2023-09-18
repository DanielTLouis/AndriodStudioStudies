package com.example.dicerollerwithimagesWithTwoDice

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import com.example.rolldicewithimages2dicerolled.R

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : ComponentActivity() {

    /**
     * This method is called when the Activity is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //find the two dice layout and dice images
        //val twoDiceLayout : View = findViewById(R.id.twoDiceLayout)
        //val dice2ImageView : ImageView = findViewById(R.id.dice2ImageView)
        //val dice3ImageView : ImageView = findViewById(R.id.dice3ImageView)
        //hide the two dice view
        //twoDiceLayout.visibility = View.GONE

        //Find the image layout of one dice
        //val diceImage: ImageView = findViewById(R.id.imageView)

        // Find the Button in the layout
        //val rollButton: Button = findViewById(R.id.button)

        //Find the roll 2 dice button
        //val roll2DiceButton : Button = findViewById(R.id.roll2DiceButton)

        // Set a click listener on the button to roll the dice when the user taps the button
        /*rollButton.setOnClickListener {
            twoDiceLayout.visibility = View.GONE
            diceImage.visibility = View.VISIBLE
            rollDice(diceImage)
        }*/

        //Set a click listener on the button to roll 2 dice whn the user taps the button
        /*roll2DiceButton.setOnClickListener(){
            twoDiceLayout.visibility = View.VISIBLE
            diceImage.visibility = View.GONE
            rollDice(dice3ImageView)
            rollDice(dice2ImageView)
        }*/

        // Do a dice roll when the app starts
        //rollDice(diceImage)
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    /*private fun rollDice(diceImage : ImageView){
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Find the ImageView in the layout
        //val diceImage: ImageView = findViewById(R.id.imageView)

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        //diceImage.contentDescription = diceRoll.toString()
    }*/
}

/**
 * Dice with a fixed number of sides.
 */
/*class Dice(private val numSides: Int) {

    /**
     * Do a random dice roll and return the result.
     */
    fun roll(): Int {
        return (1..numSides).random()
    }
}*/
