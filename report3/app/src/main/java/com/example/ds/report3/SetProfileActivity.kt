package com.example.ds.report3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_set_profile.*

class SetProfileActivity : AppCompatActivity() {

    var name : String? = ""
    var msg : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_profile)

        imageView.setImageResource(intent.getIntExtra("photo", R.drawable.yellow))
        name = intent.getStringExtra("name")
        textView!!.text = name
        textView2!!.text = intent.getStringExtra("type")

        when (name) {
            "피카츄" -> msg = "뺨의 양쪽에 작은 전기 주머니가 있다. 위기 상황일 때 방전한다."
            "꼬부기" -> msg = "긴 목을 등껍질 속에 집어넣을 때 힘차게 물대포를 발사한다."
            "파이리" -> msg = "태어날 때부터 꼬리의 불꽃이 타오르고 있다. 불꽃이 꺼지면 그 생명이 다하고 만다."
            "이상해씨" -> msg = "태어날 때부터 등에 식물의 씨앗이 있고 조금씩 크게 자란다."
            "푸린" -> msg = "둥글고 커다란 눈으로 상대를 유인해서 기분 좋은 노래를 들려주어 잠들게 한다."
        }
        textView3.text = msg

        button.setOnClickListener { finish() }
    }
}
