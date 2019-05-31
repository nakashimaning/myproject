package com.pratice

fun main(args: Array<String>) {
//    println("Hello kotlin")

//    Human().hello() //產生物件並呼叫方法

//    可以用val var來定義物件
//    val(value)代表當我定義完這個物件之後就不能再改變他的值
    val h = Human() //建構一個Human物件
    h.hello()

    val age: Int = 19;

}

class Human {   //直接設計類別,在同個package下,名稱不可以有跟java檔裡重複,否則會衝突
    fun hello() { //不回傳任何方法可以不寫void
        println("Hello kotlin") //可以加分號也可以不加
    }
}