package sopt.org.report4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        main2_tab.addTab(main2_tab.newTab().setText("1번탭"))
        main2_tab.addTab(main2_tab.newTab().setText("2번탭"))
        main2_tab.addTab(main2_tab.newTab().setText("3번탭"))
        main2_tab.addTab(main2_tab.newTab().setText("4번탭"))

        var tabAdapter = TabAdapter(supportFragmentManager, main2_tab.tabCount)
        main2_viewpager.adapter = tabAdapter
        main2_viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(main2_tab))

        main2_tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                main2_viewpager.currentItem = tab!!.position
            }

        })

    }
}
