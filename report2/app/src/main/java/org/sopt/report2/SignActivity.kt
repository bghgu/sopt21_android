package org.sopt.report2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign.*

class SignActivity : AppCompatActivity() {

    var getText_id : String = ""
    var getText_passwd : String = ""
    var getText_name : String = ""
    var getText_major : String = ""
    var msg : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        btn_submit.setOnClickListener {
            getText_id = editText_id!!.text.toString()
            getText_passwd = editText_passwd!!.text.toString()
            getText_name = editText_name!!.text.toString()
            getText_major = editText_major!!.text.toString()

            val alert = AlertDialog.Builder(this)
            alert.setNeutralButton("닫기", null)

            if(getText_id.isEmpty()) {
                alert.setTitle("아이디를 입력해 주세요")
                alert.create().show()
            }
            else if(getText_passwd.isEmpty()) {
                alert.setTitle("비밀번호를 입력해 주세요")
                alert.create().show()
            }
            else if(getText_name.isEmpty()) {
                alert.setTitle("이름울 입력해 주세요")
                alert.create().show()
            }
            else if(getText_major.isEmpty()) {
                alert.setTitle("전공을 입력해 주세요")
                alert.create().show()
            }
            else {
                val intent = Intent(applicationContext, SetProfileActivity::class.java)

                /*
                intent.putExtra("getText_id", getText_id)
                intent.putExtra("getText_passwd", getText_passwd)
                intent.putExtra("getText_name", getText_name)
                intent.putExtra("getText_major", getText_major)
                */

                setString(this, "getText_id", getText_id)
                setString(this, "getText_passwd", getText_passwd)
                setString(this, "getText_name", getText_name)
                setString(this, "getText_major", getText_major)

                startActivity(intent)
            }

        }

        btn_reset.setOnClickListener {
            editText_id!!.text.clear()
            editText_passwd!!.text.clear()
            editText_name!!.text.clear()
            editText_major!!.text.clear()
        }
    }
}
