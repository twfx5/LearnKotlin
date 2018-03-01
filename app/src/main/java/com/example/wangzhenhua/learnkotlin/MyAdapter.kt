package com.example.wangzhenhua.learnkotlin

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by wang on 2018/3/1.
 * ListView 的 Adapter
 */
class MyAdapter (private var context: Context, private var list: ArrayList<String>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder : ViewHolder
        val v :View

        if (convertView == null) {
            v = View.inflate(context, R.layout.layout_item, null)
            holder = ViewHolder(v)
            v.tag = holder
        } else {
            v = convertView
            holder = v.tag as ViewHolder
        }

        holder.textView!!.text = list[position]

        return v
    }

    override fun getItem(position: Int): String {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

    class ViewHolder(view : View) {
        var textView : TextView? = view.findViewById(R.id.str)
    }
}