package com.example.ds.report3

import android.support.v7.widget.RecyclerView
import android.text.style.BackgroundColorSpan
import android.view.View
import android.widget.*
import org.w3c.dom.Text

/**
 * Created by ds on 2017-10-29.
 */
class viewHolder1(itemView : View?) : RecyclerView.ViewHolder(itemView) {

    var background : RelativeLayout = itemView!!.findViewById(R.id.list_relative)
    var image : ImageView = itemView!!.findViewById(R.id.list_images)
    var name : TextView = itemView!!.findViewById(R.id.list_name)
    var button : Button = itemView!!.findViewById(R.id.list_button)

}