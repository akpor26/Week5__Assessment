package com.onovughe.week5assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Jacki", "Chan", R.drawable.jackie ))
        arrayList.add(Model("Beyounce", "Knowless", R.drawable.beyounce ))
        arrayList.add(Model("David", "Adeleke", R.drawable.davido ))
        arrayList.add(Model("Kelechi", "Ihanacho", R.drawable.jackie ))
        arrayList.add(Model("Dayo", "alogun", R.drawable.jackie ))
        arrayList.add(Model("Jet", "Li", R.drawable.jetli ))
        arrayList.add(Model("Lionel", "Messi", R.drawable.messi ))
        arrayList.add(Model("Cristiano", "Ronaldo", R.drawable.cr7 ))

        val myAdapter = MyAdapter(arrayList, this)
        recycler1.layoutManager = LinearLayoutManager(this)
        recycler1.adapter = myAdapter
    }
}