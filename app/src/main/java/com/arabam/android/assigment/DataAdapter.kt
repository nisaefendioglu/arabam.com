package com.arabam.android.assigment

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.arabam.android.assigment.DataModel
import com.arabam.android.assigment.R


class DataAdapter (private var dataList: List<DataModel>) :

    RecyclerView.Adapter<DataAdapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val listView: ListView = itemView.lv_list
            val imageView: ImageView = itemView.image_view
            val textView: TextView = itemView.text_view
            val textView2: TextView = itemView.text_view2
            val textView3: TextView = itemView.textview3
            val textView4: TextView = itemView.textview4
            val textView5: TextView = itemView.textview5
            val textView6: TextView = itemView.textview6
            val textView7: TextView = itemView.textview7
            val textView8: TextView = itemView.textview8
            val textView9: TextView = itemView.textview9
            val textView10: TextView = itemView.textview10
            val textView11: TextView = itemView.textview11
            val textView12: TextView = itemView.textview12
            val textView13: TextView = itemView.textview13
            val textView14: TextView = itemView.textview14
            val textView15: TextView = itemView.textview15
            val textView16: TextView = itemView.textview16
            val textView17: TextView = itemView.textview17
            val textView18: TextView = itemView.textview18

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.content_main, parent, false)
        )

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            DataModel = dataList[position]

            holder.imageView.load(DataModel.imageUrl) {
                placeholder(R.drawable.ic_launcher_background)
            }
            holder.textView.text = DataModel.info
            holder.textView2.text = DataModel.item

            holder.textView3.text = DataModel.İnfo.name
            holder.textView4.text = DataModel.İnfo._postman_id
            holder.textView5.text = DataModel.İnfo.schema

            holder.textView6.text = DataModel.İtem.id
            holder.textView7.text = DataModel.İtem.name
            holder.textView8.text = DataModel.İtem.request
            holder.textView9.text = DataModel.İtem.response

            holder.textView10.text = DataModel.Request.method
            holder.textView11.text = DataModel.Request.url

            holder.textView12.text = DataModel.Url.host
            holder.textView13.text = DataModel.Url.path
            holder.textView14.text = DataModel.Url.protocol
            holder.textView15.text = DataModel.Url.query
            holder.textView16.text = DataModel.Url.raw

            holder.textView17.text = DataModel.Query.key
            holder.textView18.text = DataModel.Query.value

        }

        override fun getItemCount() = dataList.size
    }