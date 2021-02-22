package com.arabam.android.assigment.service

import com.arabam.android.assigment.view.CarsDetailFragment
import io.reactivex.Single
import okhttp3.MediaType
import retrofit2.Retrofit
import com.arabam.android.assigment.model.CarsList
import com.arabam.android.assigment.model.CarsDetail
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitProvider {

    private const val BASE_URL = "http://sandbox.arabamd.com/" //servis linkinin sabit olan kısmı.
    private val contentType: MediaType = MediaType.get("application/json")
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(Json.asConverterFactory(contentType))
        .build();

    val API = retrofit.create<CarsService>()

    fun getCarsList(): List<CarsList> {
        return API.getCarsList()
    }
    fun getCarsDetail(id: Int): List<CarsDetailFragment> {
        return API.getCarsDetail()
    }

}

