package org.sopt.report2

import android.content.Context

val PREFS_FILENAME = "data"

fun setString(context : Context, key : String, value : String) {
    val prefs = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
    val editor = prefs!!.edit()
    editor.putString(key, value).apply()
}

fun getString(context : Context, key : String) : String{
    val prefs = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
    return prefs.getString(key, "")
}

fun setInt(context : Context, key : String, value : Int) {
    val prefs = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
    val editor = prefs!!.edit()
    editor.putInt(key, value).apply()
}

fun getInt(context : Context, key : String) : Int{
    val prefs = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)
    return prefs.getInt(key, 0)
}