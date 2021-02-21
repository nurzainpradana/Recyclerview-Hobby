package com.zainpradana.belajarkotlin.recyclerviewhobi

import android.content.Context
import android.widget.Toast

class Extension {
    companion object {
        fun showToastShort(context: Context, message: String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        fun showToastLong(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }

}