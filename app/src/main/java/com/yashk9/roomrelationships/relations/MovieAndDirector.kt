package com.yashk9.roomrelationships.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.yashk9.roomrelationships.model.Director
import com.yashk9.roomrelationships.model.Movie

data class MovieAndDirector(
    @Embedded  val director: Director,
    @Relation(
        parentColumn = "directorName",
        entityColumn = "directorName"
    )
    val movie: List<Movie>
)
