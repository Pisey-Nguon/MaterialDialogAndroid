package com.example.demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.material_dialog.MaterialAlertDialog
import com.example.material_dialog.MaterialLoadingDialog

class MainActivity : AppCompatActivity() {
    private lateinit var materialLoading:MaterialLoadingDialog
    private lateinit var materialAlertDialog:MaterialAlertDialog
    private val TAG = this.javaClass.name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        materialLoading = MaterialLoadingDialog(this)
        materialAlertDialog = MaterialAlertDialog(this)

        findViewById<AppCompatButton>(R.id.btnOpenLoadingDialogNoTitle).setOnClickListener {
            openLoadingDialogNoTitle()
        }

        findViewById<AppCompatButton>(R.id.btnOpenLoadingDialogWithTitle).setOnClickListener {
            openLoadingDialogWithTitle()
        }

        findViewById<AppCompatButton>(R.id.btnOpenAlertDialog).setOnClickListener {
            openAlertDialog()
        }
    }

    private fun openLoadingDialogNoTitle(){
        materialLoading
            .setTitleColor(R.color.black)
            .setProgressBarColor(R.color.purple_200)
            .setCancelable(true)
            .setOnDismissListener {
                Log.d(TAG, "openLoadingDialog: Dismissed")
            }
            .show()
    }

    private fun openLoadingDialogWithTitle(){
        materialLoading
            .setTitle("Loading")
            .setTitleColor(R.color.black)
            .setProgressBarColor(R.color.purple_200)
            .setCancelable(true)
            .setOnDismissListener {
                Log.d(TAG, "openLoadingDialog: Dismissed")
            }
            .show()
    }


    private fun openAlertDialog(){
        materialAlertDialog
            .setTitle("This is my title")
            .setMessage("This is my message")
            .setCancelable(true)
            .setIcon(ContextCompat.getDrawable(this,R.drawable.ic_alert)!!)
            .setOnDismissListener {
                Log.d(TAG, "openAlertDialog: Dismissed")
            }
            .setOnButtonPositiveListener("Yes"){
                Log.d(TAG, "openAlertDialog: Clicked Yes")
            }
            .setOnButtonNegativeListener("No"){
                Log.d(TAG, "openAlertDialog: Clicked No")
            }
            .show()
    }
}