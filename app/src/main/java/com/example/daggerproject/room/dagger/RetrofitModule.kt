package com.example.daggerproject.room.dagger

import com.example.daggerproject.retofit.RetrofitBuilder
import com.example.daggerproject.retofit.RetrofitService
import dagger.Module
import dagger.Provides

@Module
class RetrofitModule {

    @Provides
    fun provideRetrofitService(retrofitBuilder: RetrofitBuilder): RetrofitService =
        retrofitBuilder.buildAPI(RetrofitService::class.java)
}