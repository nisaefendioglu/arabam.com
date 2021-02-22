package com.arabam.android.assigment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.arabam.android.assigment.R
import com.arabam.android.assigment.model.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.content_main.view.*

class DataAdapter (private var dataList: List<CarsList>) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>()
    {
        //arayüz elemanlarını id leri ile çağırma.
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val imageView: ImageView = itemView.imageView2
            val textView: TextView = itemView.textViewDetailTitle
            val textView2: TextView = itemView.textViewDetailLocation

        }

        //onCreateViewHolder: RecyclerView’ımız yeni bir ViewHolder oluşturmaya ihtiyaç duyduğu anda çağırılır.
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.content_main, parent, false)
        )

        //onBindViewHolder: Belli bir indisteki ViewHolder elemanının nasıl gözükeceğine karar verir.
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val carsList = dataList[position]

            holder.imageView.load(carsList.photo) {
                placeholder(R.drawable.ic_launcher_background)
            }

            holder.textView.text = carsList.title
            holder.textView2.text = carsList.location.toString()

        }

        //getItemCount: listemizdeki eleman sayısını döndürür.

        override fun getItemCount() = dataList.size
    }

