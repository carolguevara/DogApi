package com.example.apidog.room

import androidx.room.*

@Dao
interface DogDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(dogEntity: DogCacheEntity): Long
    @Query("select * from doggy")
    suspend fun get(): List<DogCacheEntity>
}