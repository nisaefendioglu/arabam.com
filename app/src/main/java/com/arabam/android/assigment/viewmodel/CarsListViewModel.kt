package com.arabam.android.assigment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arabam.android.assigment.model.CarsList
import com.arabam.android.assigment.service.CarsRepo
import com.arabam.android.assigment.service.RetrofitProvider
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CarsListViewModel : ViewModel() {
    val cars = MutableLiveData<List<CarsList>>()
    val carserror = MutableLiveData<Boolean>()
    val carsloading = MutableLiveData<Boolean>()
    val carsListLiveData = MutableLiveData<List<CarsList>>()
    private val carsRepo = CarsRepo()

    //verilerin kontrolü
    private fun getCarsList() {
        viewModelScope.launch {
            val car: List<CarsList> = carsRepo.getCarsList()

            withContext(Dispatchers.Main) {
                carsListLiveData.value = car
            }
        }

         fun onSuccess(t: List<CarsList>) {
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



