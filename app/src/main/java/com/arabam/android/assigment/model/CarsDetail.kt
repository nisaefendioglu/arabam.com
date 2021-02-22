package com.arabam.android.assigment.model

data class CarsDetail (
    val id: Int,
    var text: String,
    val title: String,
    val userInfo: UserInfo,
    val category: CategoryDetail,
    val location: LocationDetail,
    val modelName: String,
    val price: Int,
    val priceFormatted: String,
    val date: String,
    val dateFormatted: String,
    val photos: List<String>,
    val properties: List<PropertyDetail>
)

data class UserInfo(
    val id: Int,
    val nameSurname: String,
    val phone: String,
    val phoneFormatted: String
)

data class CategoryDetail(
    val id: Int,
    val name: String
)

data class LocationDetail(
    val cityName: String,
    val townName: String
)

data class PropertyDetail(
    val name: String,
    val value: String
)

