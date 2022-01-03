package com.example.pokedexapp

import com.example.pokedexapp.repository.PokemonRepository
import com.example.pokedexapp.repository.buildApiService
import com.example.pokedexapp.ui.pokemondetail.PokemonDetailViewModel
import com.example.pokedexapp.ui.pokemonlist.PokemonListViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val appModule = module {

    viewModel { PokemonListViewModel(get()) }
    viewModel { PokemonDetailViewModel(get()) }
    single { PokemonRepository(buildApiService()) }
}