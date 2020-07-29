package com.example.recyclerviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {

    // RecyclerView 本体、および、LayoutManager と Adapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var adapter: RecyclerView.Adapter<*>

    // Adapter にセットするデータ (1～100)
    private val data = IntArray(100) { it + 1 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
        adapter = MyAdapter(data)
        recyclerView = findViewById<RecyclerView>(R.id.recycler_view).also {
            it.layoutManager = layoutManager
            it.adapter = adapter
        }
    }

//    private val dataset = arrayOfNulls<String>(20)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val recyclerView: RecyclerView = findViewById(R.id.my_recycler_view)
//
//        // use this setting to improve performance if you know that changes
//        // in content do not change the layout size of the RecyclerView
//        recyclerView.setHasFixedSize(true)
//
//        // use a linear layout manager
//        val rLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
//        recyclerView.setLayoutManager(rLayoutManager)
//        var i = 0
//        while (i < 20) {
//            dataset[i] = String.format(Locale.ENGLISH, "Data_0%d", i)
//            i++
//        }
//
//        // specify an adapter (see also next example)
//        val rAdapter: RecyclerView.Adapter = MyAdapter(dataset)
//        recyclerView.setAdapter(rAdapter)
//    }
}

// 参考：https://maku77.github.io/android/ui/recycler-view.html