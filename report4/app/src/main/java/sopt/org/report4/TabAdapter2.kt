package sopt.org.report4

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by ds on 2017-11-12.
 */
class TabAdapter2(fm : FragmentManager?) : FragmentStatePagerAdapter(fm) {

    var tabCount : Int = 0
    var firstTab : FirstFragment? = null
    var secondTab : SecondFragment? = null
    var thirdTab : ThirdFragment? = null
    var fourthTab : FourthFragment? = null

    constructor(fm: android.support.v4.app.FragmentManager?, tabCount: Int) : this(fm) {
        this.tabCount = tabCount
        this.firstTab = FirstFragment()
        this.secondTab = SecondFragment()
        this.thirdTab = ThirdFragment()
        this.fourthTab = FourthFragment()
    }

    override fun getItem(position: Int): Fragment? {
        when(position) {
            0 -> return firstTab
            1 -> return secondTab
            2 -> return thirdTab
            3 -> return fourthTab
        }
        return null
    }

    override fun getCount(): Int = tabCount
}