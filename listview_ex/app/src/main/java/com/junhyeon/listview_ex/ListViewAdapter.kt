package com.junhyeon.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convert = convertView
        if(convert== null){
            convert = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item,parent,false)
        }

        val title = convert!!.findViewById<TextView>(R.id.listviewItem)
        val content = convert!!.findViewById<TextView>(R.id.listviewItem2)
        title.text = List[position].title
        //List[0] = ListViewModel("a","b")
        content.text = List[position].content


        return convert!!
    }
}