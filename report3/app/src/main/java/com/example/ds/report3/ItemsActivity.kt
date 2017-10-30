package com.example.ds.report3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_items.*

class ItemsActivity : AppCompatActivity(), View.OnClickListener {

    private var data : ArrayList<data2>? = null
    private var adapter : adapter2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        item_list.layoutManager = LinearLayoutManager(this)

        data = ArrayList<data2>()
        data!!.add(data2(R.drawable.yellow, "전기타입", "피카츄"))
        data!!.add(data2(R.drawable.blue, "물타입", "꼬부기"))
        data!!.add(data2(R.drawable.red, "불타입", "파이리"))
        data!!.add(data2(R.drawable.green, "풀타입", "이상해씨"))
        data!!.add(data2(R.drawable.pink, "노멀타임", "푸린"))
        data!!.add(data2(R.drawable.yellow, "전기타입", "피카츄"))
        data!!.add(data2(R.drawable.blue, "물타입", "꼬부기"))
        data!!.add(data2(R.drawable.red, "불타입", "파이리"))
        data!!.add(data2(R.drawable.green, "풀타입", "이상해씨"))
        data!!.add(data2(R.drawable.pink, "노멀타임", "푸린"))
        data!!.add(data2(R.drawable.yellow, "전기타입", "피카츄"))
        data!!.add(data2(R.drawable.blue, "물타입", "꼬부기"))
        data!!.add(data2(R.drawable.red, "불타입", "파이리"))
        data!!.add(data2(R.drawable.green, "풀타입", "이상해씨"))
        data!!.add(data2(R.drawable.pink, "노멀타임", "푸린"))

        adapter = adapter2(data)
        adapter!!.setOnItemClickListener(this)
        item_list!!.adapter = adapter

    }

    override fun onClick(v: View?) {
        val idx : Int = item_list!!.getChildAdapterPosition(v)-1

        val intent = Intent(applicationContext, SetProfileActivity::class.java)
        intent.putExtra("photo", data!!.get(idx).image)
        intent.putExtra("name", data!!.get(idx).name)
        intent.putExtra("type", data!!.get(idx).type)
        intent.putExtra("idx", idx)
        startActivity(intent)
    }
}
