package com.example.ds.report3

import android.preference.PreferenceActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ds on 2017-10-29.
 */
class adapter1(var dataList : ArrayList<data1>?) : RecyclerView.Adapter<viewHolder1>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): viewHolder1 {
        val mainView : View = LayoutInflater.from(parent!!.context).inflate(R.layout.layout_data, parent, false)
        return viewHolder1(mainView)
    }

    override fun getItemCount(): Int {
        return dataList!!.size
    }

    override fun onBindViewHolder(holder: viewHolder1?, position: Int) {
        holder!!.background.setBackgroundResource(dataList!!.get(position).background)
        holder!!.image.setImageResource(dataList!!.get(position).image)
        holder!!.name.setText(dataList!!.get(position).name)
        holder!!.button.setText(dataList!!.get(position).button)
    }


}