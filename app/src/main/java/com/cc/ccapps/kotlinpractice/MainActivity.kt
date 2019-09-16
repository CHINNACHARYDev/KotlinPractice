package com.cc.ccapps.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number = 101
        val numbber = 100
        showToast(numbber.toString())
        numbber.plus(number)
        val total = numbber + number
        showToast(numbber.toString())
        number.compareTo(numbber) == 100
        showToast(numbber.toString())

        val numbers = "kds\nfks"
        val numberss = """kds
            |fk
            |s""".trimMargin()

        showToast(numbers)
        showToast(numberss)

        println(total)
        println(numbers + "\n" + numberss)
        Log.d(TAG, numbers + "\n" + numberss)
        Logger.getLogger(MainActivity::class.java.name).warning(numbers + "\n" + numberss)

        val something = if (number == 100) {
            showToast("in IF $number")
        } else {
            showToast("in ELSE $number")
        }
        showToast(something.toString())

    }

    private fun showToast(toast: String) {
        Toast.makeText(this, toast, Toast.LENGTH_LONG).show()
    }

}
