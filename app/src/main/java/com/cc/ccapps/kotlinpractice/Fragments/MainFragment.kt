package com.cc.ccapps.kotlinpractice.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

import com.cc.ccapps.kotlinpractice.R

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    val TAG = "MainFragment"

    // initializing View
    private lateinit var btnArrayList: Button

    private lateinit var arrayListFragment: ArrayListFragment

    private lateinit var fragmentTransaction: FragmentTransaction

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)

        // Finding View
        btnArrayList = view.findViewById(R.id.arrayListFrag)

        fragmentTransaction = fragmentManager!!.beginTransaction()

        btnArrayList.setOnClickListener{
            loadArrayListFragment()
        }

        return view
    }

    private fun loadArrayListFragment(){
        arrayListFragment = ArrayListFragment()
        fragmentTransaction.replace(R.id.fragmentLayout, arrayListFragment).commit()
    }


}
