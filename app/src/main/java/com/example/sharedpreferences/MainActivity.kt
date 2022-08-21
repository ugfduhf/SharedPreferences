package com.example.sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding?=null
    var myShared : SharedPreferences?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.button?.setOnClickListener {
            myShared = getSharedPreferences("myShared",0)
            var editor:SharedPreferences.Editor = myShared!!.edit()
            var userData = binding?.editText?.text.toString()
            editor.putString("name",userData)
            editor.commit()
        }
        var dataBack :SharedPreferences = getSharedPreferences("myShared",0)
        binding?.textView?.text = dataBack.getString("name1","Don't found data")
var a = 0

        // create new opjcte and named .
//        myShared = getSharedPreferences("myShared",0)
//        var editor:SharedPreferences.Editor = myShared!!.edit()
//        editor.putString("name","gogo")
//        editor.commit()


        // here save name and showing in App
//        myShared!!.edit().commit()
       // var editor:SharedPreferences.Editor = myShared!!.edit()
    }
}