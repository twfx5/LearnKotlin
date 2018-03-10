package com.example.wangzhenhua.learnkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_item.view.*

/**
 * Created by wangzhenhua on 2018/3/10.
 * 优化后的VRecycleViewAdapter
 * var 关键字声明可变属性，或者用 val 关键字声明只读属性
 */
class MyRecycleViewAdapter2(private var list: ArrayList<String>, private var itemClickListener: (String) -> Unit) :
        RecyclerView.Adapter<MyRecycleViewAdapter2.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.layout_item, parent, false), itemClickListener)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder?.bind(list[position])
    }


    class MyViewHolder(itemView: View, private var itemClickListener: (String) -> Unit) : RecyclerView.ViewHolder(itemView) {
        fun bind(str: String) {
            with(str) {
                // 利用 with 调用一个对象实例的多个方法
                itemView.str.text = str
                itemView.setOnClickListener { itemClickListener(this) }
            }
        }
    }
}