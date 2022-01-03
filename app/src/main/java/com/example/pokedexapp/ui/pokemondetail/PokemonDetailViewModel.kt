package com.example.pokedexapp.ui.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.pokedexapp.data.remote.Resource
import com.example.pokedexapp.data.remote.responses.Pokemon
import com.example.pokedexapp.repository.PokemonRepository

class PokemonDetailViewModel(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}