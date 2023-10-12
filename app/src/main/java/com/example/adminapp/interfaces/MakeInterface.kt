package com.example.adminapp.interfaces

import android.app.Activity
import android.app.Dialog
//Creacion Generica De Dialogs
interface MakeInterface {
     fun initDialog(
         activity: Activity,
         layout: Int,
         ancho: Double,
         alto: Double,
         cancelable: Boolean = true,
         transparente: Boolean = false
    ): Dialog
}