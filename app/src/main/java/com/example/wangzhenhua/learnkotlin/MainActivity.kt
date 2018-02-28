package com.example.wangzhenhua.learnkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test() {
        System.out.print("Hello")
    }

    fun sum(a:Int, b:Int):Int {
        return a + b
    }
}
