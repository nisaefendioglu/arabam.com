package com.arabam.android.assigment

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.create

object RetrofitProvider {
    private const val BASE_URL: String = "https://www.postman.com/collections/d0c83044d06639384b1b"
    private val contentType: MediaType = MediaType.get("application/json")
    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build();

    val carApi = retrofit.create<IDataModel>()
}