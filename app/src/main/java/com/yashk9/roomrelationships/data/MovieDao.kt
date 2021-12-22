package com.yashk9.roomrelationships.data

import androidx.room.*
import com.yashk9.roomrelationships.model.Character
import com.yashk9.roomrelationships.model.Director
import com.yashk9.roomrelationships.model.Movie
import com.yashk9.roomrelationships.relations.CharactersMovieCrossRef
import com.yashk9.roomrelationships.relations.MovieAndDirector
import com.yashk9.roomrelationships.relations.MovieCharacters

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: Movie)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacter(character: Character)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertMovieCharacter(movieCharacter: CharactersMovieCrossRef)

    //One to Many
    @Transaction
    @Query("SELECT * FROM Movie where directorName = :directedBy")
    suspend fun getMovieListWithDirectorName(directedBy: String): MovieAndDirector

    //One to One
    @Transaction
    @Query("SELECT * FROM Movie")
    suspend fun getMovieAndDirector(): List<Movie>

    //Many to Many
    @Transaction
    @Query("SELECT * FROM Movie where movieName = :movie")
    suspend fun getMovieCharacters(movie: String): List<MovieCharacters>

}