package org.sopt.report2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_set_profile.*

class SetProfileActivity : AppCompatActivity() {

    var index : Int = 0
    val arr = arrayListOf(R.drawable.yellow, R.drawable.blue, R.drawable.red, R.drawable.green, R.drawable.pink)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_profile)

        btn_next.setOnClickListener {
            if(index == 4) {
                index = 0
            }else {
                index++
            }
            imageView.setImageResource(arr[index])
        }
        btn_previous.setOnClickListener {
            if(index == 0) {
                index = 4
            }else {
                index--
            }
            imageView.setImageResource(arr[index])
        }

        btn_signup.setOnClickListener {
            val intent = Intent(applicationContext, LoginActivity::class.java)
            setInt(this, "photo", index)
            startActivity(intent)
        }

    }
}
