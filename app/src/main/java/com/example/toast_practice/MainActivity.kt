package com.example.toast_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_normal).setOnClickListener {
            showToast("這是一般的Toast")
        }

        findViewById<Button>(R.id.btn_customized).setOnClickListener {
            showToast("方法被棄用")
        }

        findViewById<Button>(R.id.btn_snackbar).setOnClickListener {
            Snackbar.make(it, "按鈕是Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("按鈕") {
                    showToast("已回應")
                }.show()
        }

        findViewById<Button>(R.id.btn_alertDialog).setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("按鈕式AlertDailog")
                .setMessage("AlertDialog內容")
                .setNeutralButton("左按鈕") { dialog, which ->
                    showToast("左按鈕")
                }
                .setPositiveButton("確定") {dialog, which ->
                    showToast("按下確定")
                }
                .setNegativeButton("取消"){ dialog, which ->
                    showToast("按下取消")
                }.show()
        }

        val itemArr = arrayOf("choice 1", "choice 2", "choice 3", "choice 4", "choice 5")

        findViewById<Button>(R.id.list_alertDialog).setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("按鈕式AlertDailog")
                .setItems(itemArr) { dialogInterface, i ->
                    showToast("你選的是${itemArr[i]}")
                }.show()
        }

        findViewById<Button>(R.id.radioButton_alertDialog).setOnClickListener {
            var position = 0
            AlertDialog.Builder(this)
                .setTitle("單選是列表")
                .setSingleChoiceItems(itemArr, 1) { dialogInterface, i ->
                    position = i
                }
                .setPositiveButton("確定") { dialog, which ->
                    showToast("你選的是${itemArr[position]}")
                }
                .setNegativeButton("取消") { dialog, which ->
                }
                .show()
        }
    }

    fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}