package com.rememberdev.core.domain.repository

import com.rememberdev.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface ITourismRepository {

    fun getAllTourism(): Flow<com.rememberdev.core.data.Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}