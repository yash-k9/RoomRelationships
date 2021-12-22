package com.yashk9.roomrelationships

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.yashk9.roomrelationships.data.MovieDao
import com.yashk9.roomrelationships.data.MovieDatabase
import com.yashk9.roomrelationships.data.PreloadData
import com.yashk9.roomrelationships.model.Character
import com.yashk9.roomrelationships.model.Director
import com.yashk9.roomrelationships.model.Movie
import com.yashk9.roomrelationships.relations.CharactersMovieCrossRef
import com.yashk9.roomrelationships.relations.MovieCharacters
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dao: MovieDao = MovieDatabase.getInstance(this).movieDao

        val movieList = PreloadData.getMovieList()
        val directorList = PreloadData.getDirectorList()
        val characterList = PreloadData.getCharactersList()
        val movieCharacterList = PreloadData.getCharacterMovieCrossRefList()

        lifecycleScope.launch {
            movieList.forEach { dao.insertMovie(it) }
            directorList.forEach { dao.insertDirector(it) }
            characterList.forEach { dao.insertCharacter(it) }
            movieCharacterList.forEach { dao.insertMovieCharacter(it) }
        }

    }
}