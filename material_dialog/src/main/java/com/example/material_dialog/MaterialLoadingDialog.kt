package com.example.material_dialog

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.material_dialog.component.LoadingDialog
import com.example.material_dialog.component.MaterialLoadingInterface

class MaterialLoadingDialog(private val context: Context): MaterialLoadingInterface {

    private val loadingDialog = LoadingDialog()

    override fun setTitle(title: String): MaterialLoadingInterface {
        loadingDialog.setTitle(title)
        return this
    }

    override fun setTitleColor(titleColor: Int): MaterialLoadingInterface {
        loadingDialog.setTitleColor(titleColor)
        return this
    }

    override fun setProgressBarColor(progressBarColor: Int): MaterialLoadingInterface {
        loadingDialog.setProgressBarColor(progressBarColor)
        return this
    }

    override fun setCancelable(cancelable: Boolean): MaterialLoadingInterface {
        loadingDialog.isCancelable = cancelable
        return this
    }

    override fun setOnDismissListener(dismissListener: () -> Unit): MaterialLoadingInterface {
        loadingDialog.setDismissListener(dismissListener)
        return this
    }

    override fun show() {
        loadingDialog.show((context as AppCompatActivity).supportFragmentManager,null)
    }

    override fun dismiss() {
        loadingDialog.dismissAllowingStateLoss()
    }

}