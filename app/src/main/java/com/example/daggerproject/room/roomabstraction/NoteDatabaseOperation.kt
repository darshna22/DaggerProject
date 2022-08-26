package com.example.daggerproject.room.roomabstraction


interface NoteDatabaseOperation {
    suspend fun insertData(note: Note): Int
    suspend fun deleteData(note: Note): Int
//    suspend fun deleteAllData(note: Note): Int
//    suspend fun updateData(): Int
//    suspend fun executeQuery()
//    fun getAllData(): LiveData<List<Int>>
}