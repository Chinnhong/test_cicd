package com.example.testgeneratedoc

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        testDoc(2,4)
        testDoc(4,5)
        findViewById<TextView>(R.id.textView).setOnClickListener {
            Log.e("my_log_test","value ${System.currentTimeMillis()}")
        }
    }

    /**
     * Adds two integers together and returns the result.
     *
     * This function takes two integer values as input, adds them, and returns their sum.
     * It's a simple utility function for performing addition.
     *
     * @param value1 The first integer value to be added.
     * @param value2 The second integer value to be added.
     * @return The sum of `value1` and `value2`.
     *
     * @see [testDoc]
     *
     * Example usage: Testing sum function
     *
     */
    fun testDoc(value1: Int, value2: Int): Int {
        return value1 + value2
    }
}