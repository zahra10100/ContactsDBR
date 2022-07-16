package com.example.userapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var adaptor:AdapterUs
    private  lateinit var  layoutManager: LinearLayoutManager
     lateinit var rec: RecyclerView
    private lateinit var btn: Button


    companion object{
        val list: ArrayList<ModelUs> = arrayListOf()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById<Button>(R.id.button)

         rec= findViewById<RecyclerView>(R.id.recV)

        adaptor = AdapterUs(list)
        rec.adapter=adaptor
        rec.layoutManager= LinearLayoutManager(this)

        layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        btn.setOnClickListener {

            val intent= Intent(this@MainActivity ,ShowActivity ::class.java)
            startActivity(intent)

        }


        }


    override fun onResume() {
        super.onResume()
        adaptor.notifyDataSetChanged()
    }
    }
