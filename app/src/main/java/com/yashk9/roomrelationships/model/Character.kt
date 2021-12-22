package com.yashk9.roomrelationships.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Character(
    @PrimaryKey(autoGenerate = false)
    val characterName: String,
    val movie: String? = null
)
