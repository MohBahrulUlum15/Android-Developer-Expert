package com.rememberdev.core.domain.usecase

import com.rememberdev.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface TourismUseCase {
    fun getAllTourism(): Flow<com.rememberdev.core.data.Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}