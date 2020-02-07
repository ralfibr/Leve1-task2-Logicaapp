package com.example.logicaapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica_app.*

/**
 * @author Raeef Ibrahim
 * student nr 500766393
 * Logica App
 *
 */

class LogicaAppActivity : AppCompatActivity() {
    // variable to get the total score
    var totalscore = 0
    // final value for each case
    val case1 = "T"
    val case2 = "F"
    val case3 = "F"
    val case4 = "F"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica_app)
        callSubmit()

    }

    // call submit button
    private fun callSubmit() {
        submitBtn.setOnClickListener { onSubmit() }
    }

    // submit answers and check the total score
    private fun onSubmit() {
        totalscore = 0
         // check answers and add score
        // check also if the input is not capital later
        if (input1.text.toString() == case1 || input1.text.toString() == "t" ) {
            totalscore++

        }
        if (input2.text.toString() == case2 || input2.text.toString() == "f") {
            totalscore++

        }
        if (input3.text.toString() == case3 || input3.text.toString() == "f") {
            totalscore++
        }
        if (input4.text.toString() == case4 || input4.text.toString() == "f") {
            totalscore++
        }
        correctAnswers()


    }

    // massage with the total correct score
    private fun correctAnswers() {
        Toast.makeText(this, getString(R.string.correct, totalscore), Toast.LENGTH_SHORT).show()

    }

}
