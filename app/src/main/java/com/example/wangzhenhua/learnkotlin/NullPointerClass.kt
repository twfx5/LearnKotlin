package com.example.wangzhenhua.learnkotlin

/**
 * Created by wangzhenhua on 2018/2/28.
 * 空安全
 * Kotlin 类型系统致力于消灭空引用
 */
class NullPointerClass {

    val a : String = "a"
//    a = null  普通的 String 类型的变量不能为空，编译错误
    val l = a.length

//    允许为空，我们必须把它声明为可空的变量
    val b : String? = "b"

//    val l2 = b.length     编译错误：b 不可为空

    // 你可以检查 b 是否为空，并且分开处理下面选项
    val l2 = if (b != null) b.length else -1

    /**
     * 或者使用安全操作符 ?.
     * 如果 b 不为空则返回长度，否则返回空。
     * 这个表达式的的类型是 Int?
      */

    val l3 = b?.length

    // Elvis 操作符
    val c : String? = "c"
    val l4 = if (c != null) c.length else -1

    // 如果 ?: 左边表达式不为空则返回，否则返回右边的表达式。注意右边的表带式只有在左边表达式为空是才会执行
//    val l5 = c.length?: -1

    // !! 操作符
    val l5 = c!!.length     //这会返回一个非空的 c 或者抛出一个 c 为空的 NPE


}