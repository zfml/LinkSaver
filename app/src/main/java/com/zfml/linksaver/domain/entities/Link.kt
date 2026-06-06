package com.zfml.linksaver.domain.entities

data class Link(
    val id: Long = 0,

    val title: String,

    val url: String,

    val createdAt: Long = System.currentTimeMillis()

)
