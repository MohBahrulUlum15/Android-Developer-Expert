package com.rememberdev.core.domain.usecase

import com.rememberdev.core.domain.model.Tourism
import com.rememberdev.core.domain.repository.ITourismRepository

class TourismInteractor(private val tourismRepository: ITourismRepository) : TourismUseCase {
    override fun getAllTourism() = tourismRepository.getAllTourism()

    override fun getFavoriteTourism() = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) =
        tourismRepository.setFavoriteTourism(tourism, state)
}