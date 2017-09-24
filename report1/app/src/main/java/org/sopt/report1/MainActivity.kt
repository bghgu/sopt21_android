package org.sopt.report1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var nextButton1 : Button? = null
    var mainEdit : EditText? = null
    var editContext : String = ""

    var nextButton2 : Button? = null
    var switchEdit : EditText? = null
    var switchContext : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*nextButton1 = findViewById(R.id.main_button1) as Button
        mainEdit = findViewById(R.id.main_editText1) as EditText

        nextButton1!!.setOnClickListener {
            editContext = mainEdit!!.text.toString()
            val intent = Intent(applicationContext, Main2Activity::class.java)
            intent.putExtra("mainText", editContext)
            startActivity(intent)
        }*/

        /*
        nextButton2 = findViewById(R.id.main_button2) as Button
        switchEdit = findViewById(R.id.main_editText2) as EditText

        nextButton2!!.setOnClickListener {
            switchContext = switchEdit!!.text.toString()
            when(switchContext) {
                "1" -> {
                    val intent = Intent(applicationContext, Image1Activity::class.java)
                    startActivity(intent)
                }
                "2" -> {
                    val intent = Intent(applicationContext, Image2Activity::class.java)
                    startActivity(intent)
                }
                "3" -> {
                    val intent = Intent(applicationContext, Image3Activity::class.java)
                    startActivity(intent)
                }
                else -> {
                    val intent = Intent(applicationContext, Image4Activity::class.java)
                    startActivity(intent)
                }
            }
        }*/

        main_button1.setOnClickListener {
            editContext = main_editText1!!.text.toString()
            val intent = Intent(applicationContext, Main2Activity::class.java)
            intent.putExtra("mainText", editContext)
            startActivity(intent)
        }

        main_button2.setOnClickListener {
            switchContext = main_editText2!!.text.toString()
            when(switchContext) {
                "1" -> {
                    val intent = Intent(applicationContext, Image1Activity::class.java)
                    startActivity(intent)
                }
                "2" -> {
                    val intent = Intent(applicationContext, Image2Activity::class.java)
                    startActivity(intent)
                }
                "3" -> {
                    val intent = Intent(applicationContext, Image3Activity::class.java)
                    startActivity(intent)
                }
                else -> {
                    val intent = Intent(applicationContext, Image4Activity::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}
