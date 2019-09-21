package com.cc.ccapps.kotlinpractice.Utils

import android.content.Context
import android.widget.Toast

/**
 * Created by CHINNA CHARY on Thursday, 19 Sep 2019
 * Project Name KotlinPractice
 * Package Name com.cc.ccapps.kotlinpractice.Utils
 **/
class AlertUtils {

    fun ShowToast(message: String, context: Context) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}