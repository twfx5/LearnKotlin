package com.example.wangzhenhua.learnkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_main.*

class MainActivity : AppCompatActivity() {

//    private var textView : TextView? = null
//    private var listView : ListView? = null

    private var list : List<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)
        initView()
        initListView()
    }

    /**
     * 初始化控件时
     * 因为加入了apply plugin: 'kotlin-android-extensions'
     * 所以我们可以舍弃繁琐的findViewById
     */
    fun initView() {
        textView.text = "Hello"
        // 对控件设置监听，不用写匿名内部类,这里不需要new OnClicklistener
        textView.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
        }

        // 按钮点击跳转
        btn.text = "跳转"
        btn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

    }

    fun initListView() {
        list = ArrayList<String>()
//        (list as ArrayList<String>).add("123")
    }



}
