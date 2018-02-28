package com.example.wangzhenhua.learnkotlin

/**
 * Created by wangzhenhua on 2018/2/28.
 * 基础语法
 */
class SimpleClass {

    // 定义局部变量
    var a = 3
    var b : Int = 4
    var str = "hello"

    fun test() {
        System.out.print("Hello")
    }

    // 定义函数（有int 返回值）
    fun sum(a: Int, b: Int) : Int {
        return a + b
    }

    // 只有一个表达式作为函数体
    fun sum2(a: Int, b: Int) = a + b

    // if表达式
    fun maxOf(a: Int, b: Int) : Int{
        if (a < b) {
            return b
        } else {
            return a
        }
    }

    // if 表达式 + 表达式作为函数体
    fun minOf(a: Int, b: Int) = if(a < b) a else b


}