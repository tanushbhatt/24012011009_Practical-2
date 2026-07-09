package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i(TAG, "onCreate: Method is called..")
    }

//    override fun onResume() {
//        super.onResume()
//
//        val text = "onResume function called."
//        val duration = Toast.LENGTH_SHORT
//
//        val toast = Toast.makeText(this, text, duration)
//        toast.show()
//    }

    override fun onResume() {
        super.onResume()

        Snackbar.make(
            findViewById(R.id.main),
            "onResume function called.",
            Snackbar.LENGTH_SHORT
        ).show()
    }



}