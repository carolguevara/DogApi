package com.example.apidog.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DogNetworkEntity (

    @SerializedName("alt_names")
    @Expose
    var alt_names : String,

    @SerializedName("experimental")
    @Expose var experimental : Int,

    @SerializedName("hairless")
    @Expose
    var hairless : Int,

    @SerializedName("hypoallergenic")
    @Expose var hypoallergenic : Int,

    @SerializedName("id")
    @Expose var id : String,

    @SerializedName("life_span")
    @Expose var life_span : String,

    @SerializedName("name")
    @Expose var name : String,

    @SerializedName("natural")
    @Expose  var natural : Int,

    @SerializedName("origin")
    @Expose var origin : String,

    @SerializedName("rare")
    @Expose var rare : Int,

    @SerializedName("reference_image_id")
    @Expose var reference_image_id : String,

    @SerializedName("rex")
    @Expose var rex : Int,

    @SerializedName("short_legs")
    @Expose var short_legs : Int,

    @SerializedName("suppressed_tail")
    @Expose var suppressed_tail : Int,

    @SerializedName("temperament")
    @Expose var temperament : String,

    @SerializedName("weight_imperial")
    @Expose var weight_imperial : String,

    @SerializedName("wikipedia_url")
    @Expose var wikipedia_url : String,


)