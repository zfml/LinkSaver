package com.zfml.linksaver.data.repository

import com.zfml.linksaver.data.LinkDao
import com.zfml.linksaver.data.LinkEntity
import com.zfml.linksaver.domain.entities.Link
import com.zfml.linksaver.domain.repository.LinkRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class LinkRepositoryImpl @Inject constructor(
    private val dao: LinkDao
) : LinkRepository {

    override fun getLinks() =
        dao.getAllLinks().map { entities ->
            entities.map {
                Link(
                    id = it.id,
                    title = it.title,
                    url = it.url,
                    createdAt = it.createdAt
                )
            }
        }

    override suspend fun insert(link: Link) {
        dao.insert(
            LinkEntity(
                title = link.title,
                url = link.url,
                createdAt = System.currentTimeMillis()
            )
        )
    }

    override suspend fun delete(link: Link) {
        dao.delete(
            LinkEntity(
                id = link.id,
                title = link.title,
                url = link.url,
                createdAt = 0
            )
        )
    }
}