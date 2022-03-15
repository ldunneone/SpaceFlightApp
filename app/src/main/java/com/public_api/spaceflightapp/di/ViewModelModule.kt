package com.public_api.spaceflightapp.di

import com.public_api.spaceflightapp.viewmodel.FlightViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
   viewModel { FlightViewModel(get()) }
}

