package com.example.practical2_20012011081

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Tag="mainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    private fun showMessage(msg:String)
    {
        Log.i(Tag,msg)
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        showMessage("on start is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("on Resume is called")
    }

}