package com.zfml.linksaver.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [LinkEntity::class],
    version = 1
)
abstract class LinkDatabase : RoomDatabase() {

    abstract fun linkDao(): LinkDao
}