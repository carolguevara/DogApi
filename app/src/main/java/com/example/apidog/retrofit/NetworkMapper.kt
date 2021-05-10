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
            alt_names = entity.alt_names,
            experimental = entity.experimental,
            hairless = entity.hairless,
            hypoallergenic = entity.hypoallergenic,
            life_span = entity.life_span,
            name = entity.name,
            natural = entity.natural,
            origin = entity.origin,
            rare = entity.rare,
            reference_image_id = entity.reference_image_id,
            rex = entity.rex,
            short_legs = entity.short_legs,
            suppressed_tail = entity.suppressed_tail,
            temperament = entity.temperament,
            weight_imperial = entity.weight_imperial,
            wikipedia_url = entity.wikipedia_url,



        )
    }

    override fun mapToEntity(domainModel: Dog): DogNetworkEntity {
        return DogNetworkEntity(
            id = domainModel.id,
            alt_names = domainModel.alt_names,
            experimental = domainModel.experimental,
            hairless = domainModel.hairless,
            hypoallergenic = domainModel.hypoallergenic,
            life_span = domainModel.life_span,
            name = domainModel.name,
            natural = domainModel.natural,
            origin = domainModel.origin,
            rare = domainModel.rare,
            reference_image_id = domainModel.reference_image_id,
            rex = domainModel.rex,
            short_legs = domainModel.short_legs,
            suppressed_tail = domainModel.suppressed_tail,
            temperament = domainModel.temperament,
            weight_imperial = domainModel.weight_imperial,
            wikipedia_url = domainModel.wikipedia_url

        )
    }

    fun mapFromEntityList(entities: List<DogNetworkEntity>): List<Dog>{
        return entities.map { mapFromEntity(it) }
    }
}