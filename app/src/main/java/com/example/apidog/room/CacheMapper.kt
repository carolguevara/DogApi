package com.example.apidog.room

import com.example.apidog.model.Dog
import com.example.apidog.utils.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject
constructor():
    EntityMapper<DogCacheEntity, Dog> {
    override fun mapFromEntity(entity: DogCacheEntity): Dog {
        return Dog(
            id = entity.id,
            raza = entity.raza,
            vida = entity.vida,
            origen = entity.origen,
            temp = entity.temp,
            peso = entity.peso,
            razagrupo = entity.razagrupo,
            url = entity.url,
        )
    }

    override fun mapToEntity(domainModel: Dog): DogCacheEntity {
        return DogCacheEntity(
            id = domainModel.id,
            raza = domainModel.raza,
            vida = domainModel.vida,
            origen = domainModel.origen,
            temp = domainModel.temp,
            peso = domainModel.peso,
            razagrupo = domainModel.razagrupo,
            url = domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<DogCacheEntity>): List<Dog>{
        return entities.map { mapFromEntity(it) }
    }
}