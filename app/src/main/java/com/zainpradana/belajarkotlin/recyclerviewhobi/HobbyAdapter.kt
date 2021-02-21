package com.zainpradana.belajarkotlin.recyclerviewhobi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zainpradana.belajarkotlin.recyclerviewhobi.Extension.Companion.showToastShort

class HobbyAdapter(private val context: Context, private val hobby: List<Model>) : RecyclerView.Adapter<HobbyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    }



    override fun onBindViewHolder(holder: HobbyAdapter.ViewHolder, position: Int) {
        val hb = hobby[position]
        holder.setData(hb, position)

    }

    override fun getItemCount(): Int = hobby.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var dataDummy: Model? = null
        var onClick: Int = 0

        init {
            itemView.setOnClickListener {
                showToastShort(context, context.getString(R.string.tes))
            }
        }

        fun setData(data: Model, position: Int) {
            itemView.tv_hobby.text = data.title
            this.dataDummy = data
            this.onClick = position
        }

    }

}