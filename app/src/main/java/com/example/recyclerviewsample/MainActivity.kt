package com.example.recyclerviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
//    private var myDataset: ArrayList<String> = arrayListOf("1", "2", "3") // 表示する内容
    private var myDataset: ArrayList<String> = arrayListOf() // 表示する内容

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 表示する内容を作成
        for (i in 1..100) {
            myDataset.add(i.toString())
        }

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(myDataset)

        recyclerView = recycler_view.apply {
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