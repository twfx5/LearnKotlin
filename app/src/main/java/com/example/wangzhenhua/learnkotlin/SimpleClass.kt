package com.example.wangzhenhua.learnkotlin

/**
 * Created by wangzhenhua on 2018/2/28.
 * 基础语法
 */
class SimpleClass {

    // 定义基本变量
    val i: Int = 3

    // t不是空
    val t : String = "abc"

    /**
     * b是空安全的，怎么取b的长度
     * 空安全：对于可空引用，如果我们希望调用它的成员变量或者函数就必须先做检查，否则编译器会报错。
     * 对于可空引用，如果希望调用它的成员变量或者成员函数，直接调用会出现编译错误，有三种方法可以调用：
    （1）在调用前，需要先检查，因为可能为null
    （2）使用b?.length的形式调用，如果b为null，返回null，否则返回b.length
    （3）使用b!!.length()的形式调用，如果b为null，抛出空指针异常，否则返回b.length
      */
    fun nullSafe() {
        var b : String? = "abc"
//        t1.length = ...  编辑都不通过，强制检查，所以是空安全的
        var b1 = b?.length  // 编译可以通过，？表示t1可能为空
    }



    // 可修改的变量
    // 定义局部变量
    var a = 3
    var b: Int = 4
    var str = "hello"

    fun test() {
        System.out.print("Hello")
    }

    // 定义函数（有int 返回值）
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // 只有一个表达式作为函数体
    fun sum2(a: Int, b: Int) = a + b

    // if表达式
    fun maxOf(a: Int, b: Int): Int {
        if (a < b) {
            return b
        } else {
            return a
        }
    }

    // if 表达式 + 表达式作为函数体
    fun minOf(a: Int, b: Int) = if (a < b) a else b


}