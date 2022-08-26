package com.example.daggerproject.room.roomabstraction

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class UserOperation {

    init {
        GlobalScope.launch {
            insertData()
        }
    }


    suspend fun insertData() {
        coroutineScope {
            launch {
                val n = MyDatabaseUtility().insertData(Note("darshna"))
                println("insert data is: $n")

            }
        }
    }
}
