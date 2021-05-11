package com.example.apidog.retrofit

import android.media.Image
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DogNetworkEntity (

    @SerializedName("id")
    @Expose
    var id: String,

    @SerializedName("raza")
    @Expose
    var raza: String,

    @SerializedName("vida")
    @Expose
    var vida : String,

    @SerializedName("origen")
    @Expose
    var origen : String,

    @SerializedName("temp")
    @Expose
    var temp: String,

    @SerializedName("peso")
    @Expose
    var peso: String,

    @SerializedName("razagrupo")
    @Expose
    var razagrupo: String,

    @SerializedName("url")
    @Expose
    var url: String,



)