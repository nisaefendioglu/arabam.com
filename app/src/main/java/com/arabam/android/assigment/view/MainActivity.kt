package com.arabam.android.assigment.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.arabam.android.assigment.R
import com.arabam.android.assigment.adapter.DataAdapter
import com.arabam.android.assigment.service.RetrofitProvider
import com.arabam.android.assigment.model.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        lifecycleScope.launch {
            getData()
        }
    }
    private fun getData() {
        //verileri retrofit ile çekip listeledik.
        val response: List<CarsList> = RetrofitProvider.API.getCarsList()
        recyclerView.adapter = DataAdapter(response.orEmpty().toMutableList())
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

}
