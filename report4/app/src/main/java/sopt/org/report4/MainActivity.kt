package sopt.org.report4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_first_btn.setOnClickListener(this)
        main_second_btn.setOnClickListener(this)
        main_third_btn.setOnClickListener(this)
        main_fourth_btn.setOnClickListener(this)

        main_tag_btn.setOnClickListener(this)

        main_to_main2_btn.setOnClickListener(this)
        main_to_main3_btn.setOnClickListener(this)

        if(savedInstanceState == null) {
            val bundle = Bundle()
            bundle.putString("title", main_first_btn!!.text.toString())
            AddFragment(FirstFragment(), bundle, "first")
        }
    }

    override fun onClick(v: View?) {
        when (v) {
            main_first_btn -> {
                val bundle = Bundle()
                bundle.putString("title", main_first_btn!!.text.toString())
                ReplaceFragment(FirstFragment(), bundle, "first")
            }
            main_second_btn -> {
                val bundle = Bundle()
                bundle.putString("title", main_second_btn!!.text.toString())
                ReplaceFragment(SecondFragment(), bundle, "second")
            }
            main_third_btn -> {
                val bundle = Bundle()
                bundle.putString("title", main_third_btn!!.text.toString())
                ReplaceFragment(ThirdFragment(), bundle, "third")
            }
            main_fourth_btn -> {
                val bundle = Bundle()
                bundle.putString("title", main_fourth_btn!!.text.toString())
                ReplaceFragment(FourthFragment(), bundle, "fourth")
            }
            main_tag_btn -> {
                TagFragment(main_tag_edit.text.toString())
            }
            main_to_main2_btn -> {
                startActivity(Intent(this, Main2Activity::class.java))
            }
            main_to_main3_btn -> {
                startActivity(Intent(this, Main3Activity::class.java))
            }
        }
    }

    //붙일 프레그먼트, 지울 프레그먼트
    fun AddFragment(fragment: Fragment, bundle: Bundle, tag: String, fragment2: Fragment) {
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        fragment.arguments = bundle
        transaction.remove(fragment2)
        transaction.add(R.id.main_container, fragment, tag)
        transaction.commit()
    }

    //붙일 프레그먼트
    fun AddFragment(fragment: Fragment, bundle: Bundle, tag: String) {
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        fragment.arguments = bundle
        transaction.add(R.id.main_container, fragment, tag)
        transaction.commit()
    }

    fun ReplaceFragment(fragment: Fragment, bundle: Bundle, tag: String) {
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        fragment.arguments = bundle
        transaction.replace(R.id.main_container, fragment, tag)
        //플래그먼트를 스택에 쌓아간다
        //transaction.addToBackStack(null)
        transaction.commit()
    }

    fun TagFragment(tag : String) {
        Log.d("123123123123123123", tag)
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        //태그로 아이디를 찾는다.
        val fragment = supportFragmentManager.findFragmentByTag(tag)
        if(fragment != null) {
            Log.d("change", "찾기 성공")
            transaction.replace(R.id.main_container, fragment)
            transaction.commit()
        }
    }

}
