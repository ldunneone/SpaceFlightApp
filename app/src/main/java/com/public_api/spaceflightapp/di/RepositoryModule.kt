package com.public_api.spaceflightapp.di

import com.public_api.spaceflightapp.model.db.FlightDao
import com.public_api.spaceflightapp.model.network.FlightApiService
import com.public_api.spaceflightapp.repository.FlightRepository
import org.koin.dsl.module

val repoModule = module {
    fun provideRepository(dao: FlightDao,apiService: FlightApiService) : FlightRepository {
        return FlightRepository(dao, apiService)
    }

    single { provideRepository(get(), get()) }
}