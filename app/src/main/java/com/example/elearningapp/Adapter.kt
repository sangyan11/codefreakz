package com.example.elearningapp

import android.content.ClipData.Item
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class Adapter(data: ArrayList<CustomClass>, internal var context: Context,private val listener : OnItemClickListener) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    internal var data: List<CustomClass>



    init {
        this.data=data
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(context).inflate(R.layout.item_xml, parent, false)

        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.name.text=data[position].name
        holder.image.setImageResource(data[position].image)



       

        




    }



    override fun getItemCount(): Int {
        return data.size
    }




  inner  class ViewHolder(itemView: View)  : RecyclerView.ViewHolder(itemView),
        View.OnClickListener{


        internal val name: TextView
        internal val image: ImageView
        internal var card: CardView


        init{
            name=itemView.findViewById(R.id.lang_name)
            image=itemView.findViewById(R.id.profile_image)
            card=itemView.findViewById(R.id.card)
            itemView.setOnClickListener(this)


        }

        override fun onClick(v: View?) {
            val position = adapterPosition

            if(position!=RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }

        }

    }



    interface  OnItemClickListener{
        fun onItemClick(position:Int)
    }



}