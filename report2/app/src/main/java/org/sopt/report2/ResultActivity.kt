package org.sopt.report2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    var photo: Int = 0
    val arr = arrayListOf(R.drawable.yellow, R.drawable.blue, R.drawable.red, R.drawable.green, R.drawable.pink)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        photo = intent.getIntExtra("photo", 0)
        imageView2.setImageResource(arr[photo])

        textView_id!!.text = intent.getStringExtra("getText_id")
        textView_passwd!!.text = intent.getStringExtra("getText_passwd")
        textView_name!!.text = intent.getStringExtra("getText_name")
        textView_major!!.text = intent.getStringExtra("getText_major")

        Log.d("TAG", textView_id.text.toString())
        Log.d("TAG", textView_passwd.text.toString())
        Log.d("TAG", textView_name.text.toString())
        Log.d("TAG", textView_major.text.toString())

    }
}
