package com.example.daggerproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.daggerproject.room.dagger.DaggerMyAppComponent
import com.example.daggerproject.uilayer.CityListViewModel
import kotlinx.coroutines.*
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var cityListViewModel: CityListViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMyAppComponent.create().inject(this)


        cityListViewModel.cityList.observe(this) {
            it.let {

            }
        }
        lifecycleScope.launch {
            hitCoroutine()
        }

    }



    suspend fun hitCoroutine() {
        coroutineScope {
            val job = launch(Dispatchers.Default) {
                repeat(5) { i ->
                    try {
                        // print a message twice a second
                        println("job: I'm sleeping $i ...")
                        delay(500)
                    } catch (e: Exception) {
                        // log the exception
                        println(e)
                    }
                }
            }
            delay(1300L) // delay a bit
            println("main: I'm tired of waiting!")
            job.cancelAndJoin() // cancels the job and waits for its completion
            println("main: Now I can quit.")
        }

    }

}