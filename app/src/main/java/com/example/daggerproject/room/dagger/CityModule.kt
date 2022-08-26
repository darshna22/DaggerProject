package com.example.daggerproject.room.dagger

import com.example.daggerproject.datalayer.CityListRepository
import com.example.daggerproject.uilayer.CityListViewModel
import dagger.Module
import dagger.Provides

@Module
class CityModule {

    @Provides
    fun provideCityListViewModel(cityListViewModel: CityListRepository): CityListViewModel =
        CityListViewModel(cityListViewModel)
}