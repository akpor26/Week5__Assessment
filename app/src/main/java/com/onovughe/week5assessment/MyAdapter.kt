package com.onovughe.week5assessment

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*


class MyAdapter (val arrayList: ArrayList<Model>, val context: Context):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItems(model: Model){
            itemView.titleTv.text = model.title
            itemView.title2Tv.text = model.des
            itemView.imageTv.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        val model = arrayList.get(position)
        val gTitle: String = model.title
        val gDes: String = model.des
        val gImageView: Int = model.image

        val intent = Intent(context, DetailsActivity::class.java)
        intent.putExtra("iTitle", gTitle)
        intent.putExtra("iDescription", gDes)
        intent.putExtra("iImageView", gImageView)

        context.startActivity(intent)
    }


}