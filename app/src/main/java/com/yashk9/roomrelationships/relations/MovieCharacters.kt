package com.yashk9.roomrelationships.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.yashk9.roomrelationships.model.Character
import com.yashk9.roomrelationships.model.Movie

data class MovieCharacters(
    @Embedded val movie: Movie,
    @Relation(
        parentColumn = "movieName",
        entityColumn = "characterName",
        associateBy = Junction(CharactersMovieCrossRef::class)
    )
    val characters: List<Character>

)
