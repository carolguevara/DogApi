package com.example.apidog.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "doggy")
class DogCacheEntity (

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: String,

    @ColumnInfo(name = "raza")
    var raza: String,

    @ColumnInfo(name = "vida")
    var vida: String,

    @ColumnInfo(name = "origen")
    var origen: String,

    @ColumnInfo(name = "temp")
    var temp: String,

    @ColumnInfo(name = "peso")
    var peso: String,

    @ColumnInfo(name = "razagrupo")
    var razagrupo: String,

    @ColumnInfo(name = "url")
    var url: String



)