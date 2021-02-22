package com.arabam.android.assigment.service

import com.arabam.android.assigment.model.CarsList
import io.reactivex.Single

class CarsRepo {

  suspend fun getCarsList() = RetrofitProvider.API.getCarsList()
  suspend fun getCarsDetail() = RetrofitProvider.API.getCarsDetail()
}