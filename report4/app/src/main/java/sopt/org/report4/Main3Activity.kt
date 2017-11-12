package sopt.org.report4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        main3_tab.addTab(main3_tab.newTab().setIcon(R.drawable.icon1).setText("피카츄"))
        main3_tab.addTab(main3_tab.newTab().setIcon(R.drawable.icon2).setText("파이리"))
        main3_tab.addTab(main3_tab.newTab().setIcon(R.drawable.icon3).setText("꼬부기"))
        main3_tab.addTab(main3_tab.newTab().setIcon(R.drawable.icon4).setText("이상해씨"))

        var tabAdapter = TabAdapter(supportFragmentManager, main3_tab.tabCount)
        main3_viewpager.adapter = tabAdapter
        main3_viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(main3_tab))

        main3_tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                main3_viewpager.currentItem = tab!!.position
            }

        })
    }
}
