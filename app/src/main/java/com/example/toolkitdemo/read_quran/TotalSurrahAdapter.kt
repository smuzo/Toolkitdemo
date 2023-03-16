package com.example.toolkitdemo.read_quran

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.toolkitdemo.R
import com.example.toolkitdemo.read_quran.model.TotalSurrahModel

class TotalSurrahAdapter(val context: Context, val list: List<TotalSurrahModel>):RecyclerView.Adapter<TotalSurrahAdapter.MyViewHolder>() {
    class MyViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val number:TextView = view.findViewById(R.id.number)
        val name:TextView = view.findViewById(R.id.name)
        val englishName:TextView = view.findViewById(R.id.englishName)
        val englishNameTranslation:TextView = view.findViewById(R.id.englishNameTranslation)
        val numberOfAyahs:TextView = view.findViewById(R.id.numberOfAyahs)
        val revelationType:TextView = view.findViewById(R.id.revelationType)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.surrah_item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.number.text=list.get(position).number.toString()
        holder.name.text=list.get(position).name
        holder.englishName.text=list.get(position).englishName
        holder.englishNameTranslation.text=list.get(position).englishNameTranslation
        holder.numberOfAyahs.text=list.get(position).numberOfAyahs.toString()
        holder.revelationType.text=list.get(position).revelationType
    }

    override fun getItemCount(): Int {
        return list.size
    }
}