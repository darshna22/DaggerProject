package com.example.daggerproject.room.dagger

import com.example.daggerproject.MainActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [MyAppModule::class, CityModule::class,RetrofitModule::class])
interface MyAppComponent{
    fun inject(mainActivity: MainActivity)
}

