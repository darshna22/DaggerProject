package com.example.daggerproject

import android.app.Application
import com.example.daggerproject.room.dagger.DaggerMyAppComponent
import com.example.daggerproject.room.dagger.MyAppComponent
import com.example.daggerproject.room.dagger.MyAppModule

class MyApplication:Application() {
    private lateinit var appComponent: MyAppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = initDagger(this)
    }

    private fun initDagger(app: MyApplication): MyAppComponent =
        DaggerMyAppComponent.builder()
            .myAppModule(MyAppModule(app))
            .build()
}