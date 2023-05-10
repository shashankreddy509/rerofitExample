package com.techdev.retrofitexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.techdev.retrofitexample.domain.models.NycSchoolList

class NycAdapter(private val items: NycSchoolList) : RecyclerView.Adapter<NycAdapter.NycAdapterClass>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NycAdapterClass {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)

        return NycAdapterClass(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: NycAdapterClass, position: Int) {
        val item = items[position]
        holder.title.text= item.school_name
        holder.title.text= item.num_of_sat_test_takers
    }

    class NycAdapterClass(item: View): RecyclerView.ViewHolder(item) {
        val title: TextView = item.findViewById(R.id.title)
        val desc: TextView = item.findViewById(R.id.desc)
    }

}

