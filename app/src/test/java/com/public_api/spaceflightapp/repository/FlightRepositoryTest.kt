package com.public_api.spaceflightapp.repository

import com.public_api.spaceflightapp.model.db.FlightDao
import com.public_api.spaceflightapp.model.flight.FlightResponse
import com.public_api.spaceflightapp.model.network.FlightApiService
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*


class FlightRepositoryTest {

    lateinit var flightRepository:FlightRepository

    lateinit var flightDao: FlightDao
    lateinit var flightApiService: FlightApiService

    @Before
    fun setup(){
        flightDao = mock(FlightDao::class.java)
        flightApiService = mock(FlightApiService::class.java)

        flightRepository = FlightRepository(flightDao, flightApiService)
    }
    @Test
    fun whenStoreFlightData_thenInsertFlightsCalled(){
        val flightResponse = FlightResponse(1, emptyList())
        doNothing().`when`(flightDao).insertFlights(flightResponse)

        flightRepository.storeFlightData(flightResponse)

        verify(flightDao).insertFlights(flightResponse)
    }
}