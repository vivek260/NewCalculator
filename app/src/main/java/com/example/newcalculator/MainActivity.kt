package com.example.newcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun test(){
    println("test")
    var str:String="hii guys"
    var i:Int=10
    println(i)
    println(str)
    println(test())

}
