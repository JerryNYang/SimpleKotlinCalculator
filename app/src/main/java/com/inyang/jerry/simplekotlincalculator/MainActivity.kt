package com.inyang.jerry.simplekotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sub(view: View)
    {
        var a : Int = Number1.text.toString().toInt()
        var b : Int = Number2.text.toString().toInt()
        var result : Int = a - b

        resultTV.text = "N1 - N2 = $result"


    }

    fun sum(view:View)
    {
        var a : Int = Number1.text.toString().toInt()
        var b : Int = Number2.text.toString().toInt()
        var result : Int = a + b

        resultTV.text = "N1 + N2 = $result"

    }

    fun div(view: View)
    {
        var a : Int = Number1.text.toString().toInt()
        var b : Int = Number2.text.toString().toInt()
        var result : Int = a / b

        resultTV.text = "N1 / N2 = $result"

    }

    fun mult(view: View)
    {
        var a : Int = Number1.text.toString().toInt()
        var b : Int = Number2.text.toString().toInt()
        var result : Int = a * b

        resultTV.text = "N1 * N2 : $result"

    }



}
