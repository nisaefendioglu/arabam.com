package com.arabam.android.assigment

import retrofit2.http.GET

interface IDataModel {
    @GET("/http.json")
    suspend fun getDataModelList(): List<DataModel>
}