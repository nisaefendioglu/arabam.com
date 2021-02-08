package com.arabam.android.assigment

import android.accounts.AuthenticatorDescription
import android.os.Bundle
import android.provider.ContactsContract
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch
import kotlinx.serialization.SerialName

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        lifecycleScope.launch {
            getData()
        }
    }
    private suspend fun getData() {
        val response: List<DataModel> = RetrofitProvider.carApi.getDataModelList()
        lv_list.adapter = DataAdapter(response.orEmpty().toMutableList())
        lv_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

}
