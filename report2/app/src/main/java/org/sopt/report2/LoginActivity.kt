package org.sopt.report2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    var id: String = ""
    var passwd: String = ""

    var getText_id: String? = ""
    var getText_passwd: String? = ""
    var getText_name: String? = ""
    var getText_major: String? = ""
    var photo: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /*
        getText_id = intent.getStringExtra("getText_id")
        getText_passwd = intent.getStringExtra("getText_passwd")
        getText_name = intent.getStringExtra("getText_name")
        getText_major = intent.getStringExtra("getText_major")
        */

        getText_id = getString(this, "getText_id")
        getText_passwd = getString(this, "getText_passwd")
        getText_name = getString(this, "getText_name")
        getText_major = getString(this, "getText_major")
        photo = getInt(this, "photo")

        btn_login.setOnClickListener {
            if (getText_id == "") {
                val alert = AlertDialog.Builder(this)
                alert.setTitle("회원정보가 없습니다.")
                alert.setNeutralButton("닫기", null)
                alert.create().show()
            } else {
                id = input_id!!.text.toString()
                passwd = input_passwd!!.text.toString()
                if (id != getText_id) {
                    val alert = AlertDialog.Builder(this)
                    alert.setTitle("아이디가 틀렸습니다.")
                    alert.setNeutralButton("닫기", null)
                    alert.create().show()
                } else {
                    if (passwd != getText_passwd) {
                        val alert = AlertDialog.Builder(this)
                        alert.setTitle("비밀번호가 틀렸습니다.")
                        alert.setNeutralButton("닫기", null)
                        alert.create().show()
                    } else {
                        val intent = Intent(applicationContext, ResultActivity::class.java)
                        intent.putExtra("getText_id", getText_id)
                        intent.putExtra("getText_passwd", getText_passwd)
                        intent.putExtra("getText_name", getText_name)
                        intent.putExtra("getText_major", getText_major)
                        intent.putExtra("photo", photo)
                        startActivity(intent)
                        Log.d("TAG", getText_id)
                    }
                }
            }
        }

        btn_signup.setOnClickListener {
            val intent = Intent(applicationContext, SignActivity::class.java)
            startActivity(intent)
        }

    }
}
