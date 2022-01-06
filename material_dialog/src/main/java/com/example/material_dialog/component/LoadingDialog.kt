package com.example.material_dialog.component

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import com.example.material_dialog.R
import com.google.android.material.progressindicator.CircularProgressIndicator

internal class LoadingDialog:DialogFragment() {

    private var title:String? = null
    private var titleColor:  Int? = null
    private var progressBarColor:Int? = null
    private var dismissListener:(() -> Unit)? = null
    fun setTitle(title:String){
        this.title = title
    }

    fun setTitleColor(@ColorRes titleColor:Int){
        this.titleColor = titleColor
    }

    fun setProgressBarColor(@ColorRes progressBarColor:Int){
        this.progressBarColor = progressBarColor
    }
    fun setDismissListener(dismissListener:() -> Unit){
        this.dismissListener = dismissListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_TITLE, R.style.LoadingDialogTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_dialog,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tvLoading = view.findViewById<TextView>(R.id.tvLoading)
        val progressBar = view.findViewById<CircularProgressIndicator>(R.id.progressBarCircular)
        val containerProgressBar = view.findViewById<LinearLayoutCompat>(R.id.containerProgressBar)
        if (title != null && title != ""){
            tvLoading.text = title
            tvLoading.visibility = View.VISIBLE
        }else{
            val dp20 = view.context.resources.getDimensionPixelSize(R.dimen.dp_20)
            containerProgressBar.setPadding(dp20,dp20,dp20,dp20)
            tvLoading.visibility = View.GONE
        }
        titleColor?.let {
            tvLoading.setTextColor(ContextCompat.getColor(view.context,it))
        }

        progressBarColor?.let {
            progressBar.setIndicatorColor(ContextCompat.getColor(view.context,it))
        }
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        dismissListener?.invoke()
    }

}