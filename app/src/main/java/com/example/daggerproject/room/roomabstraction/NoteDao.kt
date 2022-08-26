package com.example.daggerproject.room.roomabstraction

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

//    @Query("delete from note_table")
//    fun deleteAllNotes()
//
//    @Query("select * from note_table order by priority desc")
//    fun getAllNotes(): LiveData<List<Note>>
}