package com.arabam.android.assigment.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class CarsList(
    @SerializedName("category")
    val category: Category,
    @SerializedName("date")
    val date: String,
    @SerializedName("dateFormatted")
    val dateFormatted: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("location")
    val location: Location,
    @SerializedName("modelName")
    val modelName: String,
    @SerializedName("photo")
    val photo: String,
    @SerializedName("price")
    val price: Int,
    @SerializedName("priceFormatted")
    val priceFormatted: String,
    @SerializedName("properties")
    val properties: List<Property>,
    @SerializedName("title")
    val title: String
)

@Entity
data class Category(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)

@Entity
data class Location(
    @SerializedName("cityName")
    val cityName: String,
    @SerializedName("townName")
    val townName: String
)

@Entity
data class Property(
    @SerializedName("name")
    val name: String,
    @SerializedName("value")
    val value: String
)