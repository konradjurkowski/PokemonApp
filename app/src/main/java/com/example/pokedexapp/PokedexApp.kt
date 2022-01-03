package com.example.pokedexapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class PokedexApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
        Timber.plant(Timber.DebugTree())
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@PokedexApp)
            modules(appModule)
        }
    }
}