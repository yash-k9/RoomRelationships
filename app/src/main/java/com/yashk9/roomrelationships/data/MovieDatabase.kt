package com.yashk9.roomrelationships.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yashk9.roomrelationships.model.Character
import com.yashk9.roomrelationships.model.Director
import com.yashk9.roomrelationships.model.Movie
import com.yashk9.roomrelationships.relations.CharactersMovieCrossRef

@Database(
    entities = [
        Movie::class,
        Director::class,
        Character::class,
        CharactersMovieCrossRef::class
    ],
    version = 4,
    exportSchema = false
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao

    companion object{
        @Volatile
        private var INSTANCE: MovieDatabase? = null

        fun getInstance(context: Context): MovieDatabase{
             synchronized(this){
                 return INSTANCE ?: Room.databaseBuilder(
                     context,
                     MovieDatabase::class.java,
                     "movieDb"
                 ).fallbackToDestructiveMigration()
                 .build().also {
                     INSTANCE = it
                 }
             }
        }
    }
}