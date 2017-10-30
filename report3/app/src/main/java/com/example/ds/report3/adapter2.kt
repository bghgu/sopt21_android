package com.example.ds.report3

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ds on 2017-10-29.
 */
class adapter2(var dataList : ArrayList<data2>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_HEADER : Int = 0
    private val TYPE_ITEM : Int = 1
    private val TYPE_FOOTER : Int = 2

    private var onItemClick : View.OnClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder{
        if(viewType == TYPE_ITEM) {
            val mainView : View = LayoutInflater.from(parent!!.context).inflate(R.layout.items_data, parent, false)
            mainView.setOnClickListener(onItemClick)
            return viewHolder2(mainView)
        }else if(viewType == TYPE_HEADER) {
            val headView : View = LayoutInflater.from(parent!!.context).inflate(R.layout.header, parent, false)
            return headerHolder(headView)
        }else {
            val footerView : View = LayoutInflater.from(parent!!.context).inflate(R.layout.footer, parent, false)
            return footerHolder(footerView)
        }
    }

    override fun getItemViewType(position: Int): Int {
        if(isPositionHeader(position)) {
            return TYPE_HEADER
        }else if(isPositionFooter(position)) {
            return TYPE_FOOTER
        }else {
            return TYPE_ITEM
        }
    }

    override fun getItemCount(): Int {
        return dataList!!.size + 2
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is viewHolder2) {
            var itemHolder : viewHolder2? = holder
            itemHolder!!.imgae.setImageResource(dataList!!.get(position-1).image)
            itemHolder!!.type.setText(dataList!!.get(position-1).type)
            itemHolder!!.name.setText(dataList!!.get(position-1).name)
        }
    }

    fun setOnItemClickListener(l : View.OnClickListener) {
        onItemClick = l
    }

    fun isPositionHeader(position: Int): Boolean{
        return position == TYPE_HEADER
    }

    fun isPositionFooter(position: Int): Boolean{
        return position == dataList!!.size + 1
    }

}