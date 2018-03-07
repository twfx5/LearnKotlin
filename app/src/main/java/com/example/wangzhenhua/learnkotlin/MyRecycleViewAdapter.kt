package com.example.wangzhenhua.learnkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by wangzhenhua on 2018/3/7.
 * RecycleView的ViewHolder
 */
class MyRecycleViewAdapter(private var context: Context, private var list : ArrayList<String>) : RecyclerView.Adapter<MyRecycleViewAdapter.MyViewHolder>(){

    private var mOnItemClickListener: OnItemClickListener? = null

    fun setOnItemClickListener(mOnItemClickListener: OnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener
    }

    interface OnItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_item, null, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        // 对Item赋值
        holder?.textView?.text = list[position]

        holder?.itemView?.setOnClickListener {
            mOnItemClickListener?.onItemClick(holder.itemView, position)
        }
    }

    // ViewHolder需要构造函数
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        var textView = itemView.findViewById<TextView>(R.id.str)
    }
}