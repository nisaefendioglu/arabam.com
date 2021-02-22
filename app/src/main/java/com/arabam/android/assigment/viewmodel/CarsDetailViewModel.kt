package com.arabam.android.assigment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arabam.android.assigment.model.CarsDetail
import com.arabam.android.assigment.model.CarsList
import com.arabam.android.assigment.service.CarsRepo
import com.arabam.android.assigment.view.CarsDetailFragment
import io.reactivex.Single
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CarsDetailViewModel  : ViewModel()  {
    val cars = MutableLiveData<List<CarsDetail>>()
    val carserror = MutableLiveData<Boolean>()
    val carsloading = MutableLiveData<Boolean>()
    private val carsRepo = CarsRepo()
    val carsDetailLiveData = MutableLiveData<List<CarsDetailFragment>>()

    fun getCarsList() {
        viewModelScope.launch {
            val car: List<CarsDetailFragment> = carsRepo.getCarsDetail()

            withContext(Dispatchers.Main) {
               carsDetailLiveData.value = car
            }
        }
    }
    //verilerin kontrolü
    private fun getCarsDetail() {
        fun onSuccess(t: List<CarsDetail>) {
            //veriler başarılı bir şekilde çekidliğinde çalışacak kısım.
            cars.value = t
            carserror.value = false
            carsloading.value = false
        }

        //error
         fun onError(e: Throwable) {
            carserror.value = true
            carsloading.value = false
            e.printStackTrace()
        }
    }

}