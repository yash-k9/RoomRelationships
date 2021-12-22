package com.yashk9.roomrelationships.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie(
    @PrimaryKey(autoGenerate = false)
    val movieName: String,
    val directorName: String

)