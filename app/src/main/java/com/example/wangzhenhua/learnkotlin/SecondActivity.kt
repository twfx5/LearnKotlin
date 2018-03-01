package com.example.wangzhenhua.learnkotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_second.*

/**
 * Created by wang on 2018/3/1.
 * 点击跳转的界面
 */
class SecondActivity : Activity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_second)
        initView()
    }

    private fun initView() {
        textView1.text = "second Activity"
        textView2.text = "second Activity"
        textView3.text = "second Activity"

        textView1.setOnClickListener(this)
        textView2.setOnClickListener(this)
        textView3.setOnClickListener(this)
    }

    /**
     *  设置监听的第二种方式，控件设置监听，让类实现接口
     *  重写onClick方法，在方法中操作
     *  这种方式比较麻烦
     */
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.textView1 ->
                Toast.makeText(this, "textView1", Toast.LENGTH_SHORT).show()

            R.id.textView2 ->
                Toast.makeText(this, "textView2", Toast.LENGTH_SHORT).show()

            R.id.textView3 ->
                Toast.makeText(this, "textView3", Toast.LENGTH_SHORT).show()
        }
    }
}