package com.example.recyclerviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var myDataset: Array<String> = arrayOf("a","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c","b","c") // 追加 表示する内容

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(myDataset)

            recyclerView = findViewById<RecyclerView>(R.id.recycler_view).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            // コンテンツの変更によってRecyclerViewのレイアウトサイズが変更されないことがわかっている場合は、
            // この設定を使用してパフォーマンスを向上させます
            setHasFixedSize(true)

            // use a linear layout manager
            // 線形レイアウトマネージャーを使用する
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            // viewAdapterを指定します（次の例も参照）
            adapter = viewAdapter
        }
    }
}

// 参考：https://maku77.github.io/android/ui/recycler-view.html
// 公式：https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=ja