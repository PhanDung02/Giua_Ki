package com.example.ltdd_gk

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val button = findViewById<Button>(R.id.add)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var danh_sach = arrayOf("098675646", "098675646", "098675646")
       // listSdt = findViewById(R.id.listSdt) as ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, danh_sach)

        // 3. Set Adapter for ListView
        listSdt.setAdapter(adapter)

        button.setOnClickListener(){
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}