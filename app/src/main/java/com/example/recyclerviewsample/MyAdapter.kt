package com.example.recyclerviewsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/*
 * Adapter の実装（データを結びつけ、ViewHolder の生成とデータ反映を行う）
 */
class MyAdapter(private val data: IntArray) : RecyclerView.Adapter<MyViewHolder>() {
    /* 表示用データの要素数（ここでは IntArray のサイズ） */
    override fun getItemCount(): Int = data.size

    /* 新しく ViewHolder オブジェクトを生成するための実装 */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MyViewHolder(inflater.inflate(R.layout.my_text_view, parent, false))
    }

    /* position の位置のデータを使って、表示内容を適切に設定（更新）する */
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val num = data[position]
        holder.label.text = "Element-$num"
        holder.button.text = "Button-$num"
    }
}

// developer版
//class MyAdapter(private val myDataset: Array<String>):
//    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
//
//    // Provide a reference to the views for each data item
//    // Complex data items may need more than one view per item, and
//    // you provide access to all the views for a data item in a view holder.
//    // Each data item is just a string in this case that is shown in a TextView.
//    // 各データアイテムのビューへの参照を提供する複雑なデータアイテムには、アイテムごとに複数のビューが必要な場合があり、
//    // ビューホルダー内のデータアイテムのすべてのビューへのアクセスを提供します。
//    // 各データ項目は、この場合はTextViewに表示される単なる文字列です。
//    class MyViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView)
//
//    // Create new views (invoked by the layout manager)
//    // 新しいビューを作成する（レイアウトマネージャーによって呼び出される）
//    override fun onCreateViewHolder(parent: ViewGroup,
//                                    viewType: Int): MyAdapter.MyViewHolder {
//        // create a new view
//        val textView = LayoutInflater.from(parent.context)
//            .inflate(R.layout.my_text_view, parent, false) as TextView
//        // set the view's size, margins, paddings and layout parameters
//        // ビューのサイズ、マージン、パディング、レイアウトパラメータを設定する
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
//        holder.textView.text = myDataset[position]
//    }
//
//    // Return the size of your dataset (invoked by the layout manager)
//    // データセットのサイズを返します（レイアウトマネージャーによって呼び出されます）
//    override fun getItemCount() = myDataset.size
//}