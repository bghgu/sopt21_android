package com.example.ds.report3

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by ds on 2017-10-30.
 */
class footerHolder(itemView : View?) : RecyclerView.ViewHolder(itemView) {
    var footer : TextView = itemView!!.findViewById<TextView>(R.id.list_name)
}