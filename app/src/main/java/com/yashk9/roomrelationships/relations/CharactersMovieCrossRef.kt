package com.yashk9.roomrelationships.relations

import androidx.room.Entity


@Entity(primaryKeys = ["movieName", "characterName"])
data class CharactersMovieCrossRef(
    val movieName: String,
    val characterName: String
)