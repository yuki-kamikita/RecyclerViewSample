package com.example.recyclerviewsample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_text_view.view.*

// Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder.
// Each data item is just a string in this case that is shown in a TextView.
// 各データアイテムのビューへの参照を提供する複雑なデータアイテムには、アイテムごとに複数のビューが必要な場合があり、
// ビューホルダー内のデータアイテムのすべてのビューへのアクセスを提供します。
// 各データ項目は、この場合はTextViewに表示される単なる文字列です。
class MyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView by lazy {
        view.textView
    }

    // 複数入れる時のサンプル
//    val button: Button by lazy {
//        view.findViewById<Button>(R.id.button)
//    }
}