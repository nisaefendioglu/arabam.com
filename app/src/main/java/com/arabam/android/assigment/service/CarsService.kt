package com.arabam.android.assigment.service

import com.arabam.android.assigment.model.CarsDetail
import com.arabam.android.assigment.view.CarsDetailFragment
import com.arabam.android.assigment.model.CarsList
import io.reactivex.Single
import retrofit2.http.GET

interface CarsService {
 //linkin sabit olan kısmı yerine değişken olan yer, yani uzantı kısmı yazılır verileri çekebilmesi için.
 //get linkteki servisten verileri çeken , fun kısmı uygulamada istek atmak için kullanılan kısım.

  @GET("api/v1/listing?sort=1&sortDirection=0&take=10")
    fun getCarsList(): List<CarsList>

    @GET("api/v1/detail?")
    fun getCarsDetail(): List<CarsDetailFragment>

}