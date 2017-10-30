package com.example.ds.report3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_layout.*

class LayoutActivity : AppCompatActivity() {

    private var data : ArrayList<data1>? = null
    private var adapter : adapter1? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        layout_list.layoutManager = LinearLayoutManager(this)

        data = ArrayList<data1>()
        data!!.add(data1(R.color.colorYellow, R.drawable.yellow, "피카츄", "피카츄"))
        data!!.add(data1(R.color.colorBlue, R.drawable.blue, "꼬부기", "꼬부기"))
        data!!.add(data1(R.color.colorRed, R.drawable.red, "파이리", "파이리"))
        data!!.add(data1(R.color.colorGreen, R.drawable.green, "이상해씨", "이상해씨"))
        data!!.add(data1(R.color.colorPink, R.drawable.pink, "푸린", "푸린"))
        data!!.add(data1(R.color.colorYellow, R.drawable.yellow, "피카츄", "피카츄"))
        data!!.add(data1(R.color.colorBlue, R.drawable.blue, "꼬부기", "꼬부기"))
        data!!.add(data1(R.color.colorRed, R.drawable.red, "파이리", "파이리"))
        data!!.add(data1(R.color.colorGreen, R.drawable.green, "이상해씨", "이상해씨"))
        data!!.add(data1(R.color.colorPink, R.drawable.pink, "푸린", "푸린"))
        data!!.add(data1(R.color.colorYellow, R.drawable.yellow, "피카츄", "피카츄"))
        data!!.add(data1(R.color.colorBlue, R.drawable.blue, "꼬부기", "꼬부기"))
        data!!.add(data1(R.color.colorRed, R.drawable.red, "파이리", "파이리"))
        data!!.add(data1(R.color.colorGreen, R.drawable.green, "이상해씨", "이상해씨"))
        data!!.add(data1(R.color.colorPink, R.drawable.pink, "푸린", "푸린"))

        adapter = adapter1(data)
        layout_list!!.adapter = adapter
    }
}
