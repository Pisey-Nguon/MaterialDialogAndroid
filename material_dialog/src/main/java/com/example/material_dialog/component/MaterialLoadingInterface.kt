package com.example.material_dialog.component

import androidx.annotation.ColorRes

interface MaterialLoadingInterface {

    fun setTitle(title:String): MaterialLoadingInterface
    fun setTitleColor(@ColorRes titleColor:Int): MaterialLoadingInterface
    fun setProgressBarColor(@ColorRes progressBarColor:Int): MaterialLoadingInterface
    fun setCancelable(cancelable:Boolean): MaterialLoadingInterface
    fun setOnDismissListener(dismissListener:() -> Unit): MaterialLoadingInterface
    fun getIsAdded():Boolean
    fun show()
    fun dismiss()
}