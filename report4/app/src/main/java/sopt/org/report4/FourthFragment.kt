package sopt.org.report4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fourth.view.*

/**
 * Created by ds on 2017-11-12.
 */

class FourthFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater!!.inflate(R.layout.fragment_fourth, container, false)
        if(arguments != null) {
            v!!.fourth_test.text = arguments.getString("title")
        }
        return v
    }
}