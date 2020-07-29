package com.example.recyclerviewsample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// コメントなし
class MyAdapter(private val myDataset: Array<String>):
    RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_text_view, parent, false)
        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = myDataset[position]
        // 複数入れる時のサンプル ここのコメントを解除
//         holder.button.text = "Button"
    }

    override fun getItemCount() = myDataset.size
}

// 公式のコメントと翻訳版付き
//class MyAdapter(private val myDataset: Array<String>):
//    RecyclerView.Adapter<MyViewHolder>() {
//
//    // Create new views (invoked by the layout manager)
//    // 新しいビューを作成する（レイアウトマネージャーによって呼び出される）
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        // create a new view
//        val textView = LayoutInflater.from(parent.context)
//            .inflate(R.layout.my_text_view, parent, false)
//        return MyViewHolder(textView)
//    }
//
//    // Replace the contents of a view (invoked by the layout manager)
//    // ビューのコンテンツを置き換えます（レイアウトマネージャによって呼び出されます）
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        // - get element from your dataset at this position
//        // - replace the contents of the view with that element
//        // - この位置でデータセットから要素を取得する
//        // - ビューのコンテンツをその要素に置き換えます
//         holder.textView.text = myDataset[position]
//        // 複数入れる時のサンプル ここのコメントを解除
////         holder.button.text = "Button"
//    }
//
//    // Return the size of your dataset (invoked by the layout manager)
//    // データセットのサイズを返します（レイアウトマネージャーによって呼び出されます）
//    override fun getItemCount() = myDataset.size
//}