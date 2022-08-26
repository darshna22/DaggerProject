package com.example.daggerproject.room.roomabstraction

class MyDatabaseUtility : NoteDatabaseOperation {

    override suspend fun insertData(note: Note): Int {
        println("insert data={${note.name}}")
        return insertMyData(note)
    }

    override suspend fun deleteData(note: Note): Int {
        return 1
    }

    fun insertMyData(note: Note)=1

}