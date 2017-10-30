package com.example.ds.report3

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by ds on 2017-10-29.
 */
class viewHolder2(itemView : View?) : RecyclerView.ViewHolder(itemView) {
    var imgae : ImageView = itemView!!.findViewById<ImageView>(R.id.list_images)
    var type : TextView = itemView!!.findViewById<TextView>(R.id.list_type)
    var name : TextView = itemView!!.findViewById<TextView>(R.id.list_name)
}