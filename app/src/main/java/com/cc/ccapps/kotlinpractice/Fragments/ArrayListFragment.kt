package com.cc.ccapps.kotlinpractice.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.cc.ccapps.kotlinpractice.R

/**
 * A simple [Fragment] subclass.
 */
class ArrayListFragment : Fragment() {

    val TAG = "ArrayListFragment"

    private lateinit var arrayText: TextView

    private lateinit var arrayList: ArrayList<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_array_list, container, false)

        arrayText = view.findViewById(R.id.tvArrayList)

        arrayList = ArrayList()
        arrayList.add(0, "Item1")
        arrayList.add(1, "Item1")
        arrayList.add(2, "Item1")
        arrayList.add(3, "Item1")

        arrayText.setText(arrayList.toString())

        return view
    }


}
