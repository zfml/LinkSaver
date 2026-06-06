package com.zfml.linksaver.domain.repository

import com.zfml.linksaver.domain.entities.Link
import kotlinx.coroutines.flow.Flow

interface LinkRepository {

    fun getLinks(): Flow<List<Link>>

    suspend fun insert(link: Link)

    suspend fun delete(link: Link)
}