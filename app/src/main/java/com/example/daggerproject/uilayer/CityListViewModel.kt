package com.example.daggerproject.uilayer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerproject.datalayer.CityListRepository
import com.example.daggerproject.model.CityNameListResponseItem
import com.example.daggerproject.retofit.NetworkResult
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class CityListViewModel constructor(val cityListRepository: CityListRepository) : ViewModel() {
    var _cityList = MutableLiveData<List<CityNameListResponseItem>>()
    val cityList: LiveData<List<CityNameListResponseItem>>
        get() = _cityList

    var _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error

    var _loadig = MutableLiveData<Boolean>(false)
    val loading: LiveData<Boolean>
        get() = _loadig


    init {
        callCityListAPi()
        viewModelScope.launch {
            getData()
        }

    }
    suspend fun getData():Int{
        delay(2000)
        return 20
    }

    fun callCityListAPi() {
        viewModelScope.launch {
            cityListRepository.getAllMovies().collect {
                when (it) {
                    is NetworkResult.Loading -> {
                        _loadig.value = true
                    }
                    is NetworkResult.Success -> {
                        _cityList.value = it.data!!
                        _loadig.value = false
                    }
                    is NetworkResult.Error -> {
                        _error.value = it.message
                        _loadig.value = false

                    }
                }
            }
        }
    }


}