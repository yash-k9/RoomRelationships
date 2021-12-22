package com.yashk9.roomrelationships.data

import com.yashk9.roomrelationships.model.Character
import com.yashk9.roomrelationships.model.Director
import com.yashk9.roomrelationships.model.Movie
import com.yashk9.roomrelationships.relations.CharactersMovieCrossRef

object PreloadData {
    fun getDirectorList() = listOf(
        Director("Christopher Nolan"),
        Director("Imitiaz Ali"),
        Director("David Fincher")
    )

    fun getMovieList() = listOf(
        Movie("Interstellar", "Christopher Nolan"),
        Movie("Tenet", "Christopher Nolan"),
        Movie("Inception", "Christopher Nolan"),
        Movie("Highway", "Imitiaz Ali"),
        Movie("The Facebook","David Fincher")
    )

    fun getCharactersList() = listOf(
        Character(characterName="Mark", movie="The Facebook"),
        Character(characterName="Alia", movie="Highway"),
        Character(characterName="Ron", movie="Harry Potter"),
        Character(characterName="Daniel", movie="The Facebook"),
        Character(characterName="Clarke", movie="Interstellar"),
        Character(characterName="Micheal", movie="Tenet"),
        Character(characterName="Adam", movie="The Facebook"),
        Character(characterName="Alia", movie="The Facebook"),
        Character(characterName = "Micheal", movie = "Interstellar")
    )

    fun getCharacterMovieCrossRefList() = listOf(
        CharactersMovieCrossRef("Interstellar", "Clarke"),
        CharactersMovieCrossRef("Interstellar", "Micheal"),
        CharactersMovieCrossRef("Tenet", "Micheal"),
        CharactersMovieCrossRef("Highway", "Alia"),
        CharactersMovieCrossRef("The Facebook","Mark"),
        CharactersMovieCrossRef("The Facebook","Alia"),
        CharactersMovieCrossRef("The Facebook","Adam"),
        CharactersMovieCrossRef("The Facebook","Daniel"),
        CharactersMovieCrossRef("Interstellar", "Micheal")
    )
}