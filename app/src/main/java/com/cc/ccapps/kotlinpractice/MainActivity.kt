package com.cc.ccapps.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.cc.ccapps.kotlinpractice.Fragments.ArrayListFragment
import com.cc.ccapps.kotlinpractice.Fragments.MainFragment
import com.cc.ccapps.kotlinpractice.Utils.AlertUtils
import com.cc.ccapps.kotlinpractice.Utils.AlertUtilsObject
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    // creating Class Object
    private lateinit var alertUtils: AlertUtils

    // creating Fragment Object
    private lateinit var mainFragment: MainFragment

    private lateinit var fragmentManager: FragmentManager
    private lateinit var fragmentTransaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager.beginTransaction()

        loadMainFragment()

        // initializing Class Object
        alertUtils = AlertUtils()
        alertUtils.ShowToast("Welcome back to", this)
        AlertUtilsObject.ShowToast("Kotlin Practice", this)

    }

    private fun loadMainFragment(){
        mainFragment = MainFragment()
        fragmentTransaction.add(R.id.fragmentLayout, mainFragment).commit()
    }

}
