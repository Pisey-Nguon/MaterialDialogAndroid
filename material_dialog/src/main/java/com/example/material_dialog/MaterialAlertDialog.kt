package com.example.material_dialog

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.Html
import androidx.appcompat.app.AlertDialog
import com.example.material_dialog.component.MaterialAlertInterface

class MaterialAlertDialog(context: Context): MaterialAlertInterface {

    private val builder = AlertDialog.Builder(context,R.style.AlertDialogTheme)
    private var alertDialog :AlertDialog? = null

    override fun setTitle(title: String): MaterialAlertInterface {
        builder.setTitle(title)
        return this
    }

    override fun setMessage(message: String): MaterialAlertInterface {
        builder.setMessage(message)
        return this
    }

    override fun setIcon(icon: Drawable): MaterialAlertDialog {
        builder.setIcon(icon)
        return this
    }

    override fun setCancelable(cancelable: Boolean): MaterialAlertInterface {
        builder.setCancelable(cancelable)
        return this
    }

    override fun setOnDismissListener(dismissListener: () -> Unit): MaterialAlertInterface {
        builder.setOnDismissListener {
            dismissListener.invoke()
        }
        return this
    }

    override fun setOnButtonPositiveListener(
        title: String,
        buttonPositiveListener: () -> Unit
    ): MaterialAlertInterface {
        builder.setPositiveButton(Html.fromHtml("<font color='#000000'>$title</font>")) { _, _ ->
            buttonPositiveListener.invoke()
        }
        return this
    }

    override fun setOnButtonNegativeListener(
        title: String,
        buttonNegativeListener: () -> Unit
    ): MaterialAlertInterface {
        builder.setNegativeButton(Html.fromHtml("<font color='#000000'>$title</font>")) { _, _ ->
            buttonNegativeListener.invoke()
        }
        return this
    }

    override fun show() {
        alertDialog = builder.create()
        alertDialog?.show()
    }

    override fun dismiss() {
        alertDialog?.dismiss()
    }

}