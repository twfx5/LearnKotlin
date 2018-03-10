package com.example.wangzhenhua.learnkotlin

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_second.*

/**
 * Created by wang on 2018/3/1.
 * 点击跳转的界面
 */
class SecondActivity : Activity(){

    private var list : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_second)
        initView()
    }

    private fun initView() {
        list.clear()
        list.add("second Activity")
        list.add("second Activity")
        list.add("second Activity")
        list.add("second Activity")

//        val myRecycleViewAdapter = MyRecycleViewAdapter(this, list)

        rv_second.layoutManager = LinearLayoutManager(baseContext)

//        rv_second.adapter = myRecycleViewAdapter
//
//        // 暂时未添加分割线
//
//        // RecycleView 设置监听
//        myRecycleViewAdapter.setOnItemClickListener(object : MyRecycleViewAdapter.OnItemClickListener{
//            override fun onItemClick(view: View, position: Int) {
//                when (position) {
//                    0 -> {
//                        Toast.makeText(baseContext, list[position], Toast.LENGTH_SHORT).show()
//                    }
//                    1 -> {
//                        Toast.makeText(baseContext, list[position], Toast.LENGTH_SHORT).show()
//                    }
//                    2 -> {
//                        Toast.makeText(baseContext, list[position], Toast.LENGTH_SHORT).show()
//                    }
//                    3 -> {
//                        Toast.makeText(baseContext, list[position], Toast.LENGTH_SHORT).show()
//                    }
//                }
//            }

//        })

        rv_second.adapter = MyRecycleViewAdapter2(list, {
            // 点击事件
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })


    }

    /**
     *  设置监听的第二种方式，控件设置监听，让类实现接口
     *  重写onClick方法，在方法中操作
     *  这种方式比较麻烦
     */
//    override fun onClick(v: View?) {
//        when (v?.id) {
//            R.id.textView1 ->
//                Toast.makeText(this, "textView1", Toast.LENGTH_SHORT).show()
//
//            R.id.textView2 ->
//                Toast.makeText(this, "textView2", Toast.LENGTH_SHORT).show()
//
//            R.id.textView3 ->
//                Toast.makeText(this, "textView3", Toast.LENGTH_SHORT).show()
//        }
//    }
}