package org.sopt.report1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    var getText : TextView? = null
    var secondString : String? = null
    var preButton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*
        secondString = getIntent().getStringExtra("mainText")
        getText = findViewById(R.id.second_textView2) as TextView
        preButton = findViewById(R.id.second_button) as Button
        getText!!.text = secondString
        */

        /*
        preButton!!.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }*/

        second_textView2!!.text = getIntent().getStringExtra("mainText")

        second_button.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
