package com.example.userapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class ShowActivity : AppCompatActivity() {
    lateinit var userAdapter:AdapterUs

    private lateinit var name: EditText
    private lateinit var number: EditText
    private lateinit var btn: Button


    companion object{
        var users: ArrayList<ModelUs> = arrayListOf()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        name= findViewById<EditText>(R.id.name)
        number= findViewById<EditText>(R.id.number)

        btn=findViewById(R.id.btn_sav)


        btn.setOnClickListener {
            MainActivity.list.add(ModelUs(name.text.toString(),number.text.toString()))
            //startActivity(Intent(applicationContext,MainActivity::class.java))
            finish()
        }





    }

}