package com.example.material_dialog.component

import android.graphics.drawable.Drawable
import com.example.material_dialog.MaterialAlertDialog

interface MaterialAlertInterface {
    fun setTitle(title:String): MaterialAlertInterface
    fun setMessage(message:String): MaterialAlertInterface
    fun setIcon(icon:Drawable): MaterialAlertDialog
    fun setCancelable(cancelable:Boolean): MaterialAlertInterface
    fun setOnDismissListener(dismissListener:() -> Unit): MaterialAlertInterface
    fun setOnButtonPositiveListener(title:String,buttonPositiveListener:() -> Unit): MaterialAlertInterface
    fun setOnButtonNegativeListener(title:String,buttonNegativeListener:() -> Unit): MaterialAlertInterface
    fun show()
    fun dismiss()
}