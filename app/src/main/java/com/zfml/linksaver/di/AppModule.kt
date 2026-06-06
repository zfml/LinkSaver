package com.zfml.linksaver.di

import android.content.Context
import androidx.room.Room
import com.zfml.linksaver.data.LinkDao
import com.zfml.linksaver.data.LinkDatabase
import com.zfml.linksaver.data.repository.LinkRepositoryImpl
import com.zfml.linksaver.domain.repository.LinkRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): LinkDatabase =
        Room.databaseBuilder(
            context,
            LinkDatabase::class.java,
            "linksave.db"
        ).build()

    @Provides
    @Singleton
    fun provideLinkDao(
        db: LinkDatabase
    ): LinkDao =
        db.linkDao()

    @Provides
    @Singleton
    fun provideLinkRepository(
        dao: LinkDao
    ): LinkRepository = LinkRepositoryImpl(dao)



}