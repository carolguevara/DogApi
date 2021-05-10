package com.example.apidog.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "doggy")
class DogCacheEntity (

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: String,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "alt_names")
    var alt_names: String,


    @ColumnInfo(name = "experimental")
    var experimental: Int,

    @ColumnInfo(name = "hairless")
    var hairless: Int,

    @ColumnInfo(name = "hypoallergenic")
    var hypoallergenic: Int,

    @ColumnInfo(name = "life_span")
    var life_span: String,

    @ColumnInfo(name = "natural")
    var natural: Int,

    @ColumnInfo(name = "origin")
    var origin: String,

    @ColumnInfo(name = "rare")
    var rare: Int,

    @ColumnInfo(name = "reference_image_id")
    var reference_image_id: String,

    @ColumnInfo(name = "rex")
    var rex: Int,

    @ColumnInfo(name = "short_legs")
    var short_legs: Int,

    @ColumnInfo(name = "suppressed_tail")
    var suppressed_tail: Int,

    @ColumnInfo(name = "temperament")
    var temperament: String,

    @ColumnInfo(name = "weight_imperial")
    var weight_imperial: String,

    @ColumnInfo(name = "wikipedia_url")
    var wikipedia_url: String,



)