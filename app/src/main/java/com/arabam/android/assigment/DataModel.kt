package com.arabam.android.assigment
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class DataModel(
    @SerialName("info")
    val info: İnfo,
    @SerialName("item")
    val item: List<İtem>
)

@Serializable
data class İnfo(
    @SerialName("name")
    val name: String,
    @SerialName("_postman_id")
    val postmanİd: String,
    @SerialName("schema")
    val schema: String
)

@Serializable
data class İtem(
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String,
    @SerialName("request")
    val request: Request,
    @SerialName("response")
    val response: List<Any>
)

@Serializable
data class Request(
    @SerialName("header")
    val header: List<Any>,
    @SerialName("method")
    val method: String,
    @SerialName("url")
    val url: Url
)

@Serializable
data class Url(
    @SerialName("host")
    val host: List<String>,
    @SerialName("path")
    val path: List<String>,
    @SerialName("protocol")
    val protocol: String,
    @SerialName("query")
    val query: List<Query>,
    @SerialName("raw")
    val raw: String
)

@Serializable
data class Query(
    @SerialName("key")
    val key: String,
    @SerialName("value")
    val value: String
)