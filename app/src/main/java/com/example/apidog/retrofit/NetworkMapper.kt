package com.example.apidog.retrofit

import com.example.apidog.model.Dog
import com.example.apidog.utils.EntityMapper

import javax.inject.Inject

class NetworkMapper
@Inject
constructor(): EntityMapper<DogNetworkEntity, Dog> {
    override fun mapFromEntity(entity: DogNetworkEntity): Dog {
        return Dog(
            id = entity.id,
            raza = entity.raza,
            vida = entity.vida,
            origen = entity.origen,
            temp = entity.temp,
            peso = entity.peso,
            razagrupo = entity.razagrupo,
            url = entity.url



        )
    }

    override fun mapToEntity(domainModel: Dog): DogNetworkEntity {
        return DogNetworkEntity(
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

    fun mapFromEntityList(entities: List<DogNetworkEntity>): List<Dog>{
        return entities.map { mapFromEntity(it) }
    }
}