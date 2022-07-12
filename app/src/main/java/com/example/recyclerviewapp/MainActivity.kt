package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.model.Flower

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

       recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Flower>()

        data.add(Flower(R.drawable.img, "Sunflower", "summer"))
        data.add(Flower(R.drawable.img_1, "Pinkflower", "Winter"))
        data.add(Flower(R.drawable.img_2, "SkyblueFlower", "Spring"))

        val adapter = flowerAdapter(data)

        recyclerView.adapter = adapter
    }
}