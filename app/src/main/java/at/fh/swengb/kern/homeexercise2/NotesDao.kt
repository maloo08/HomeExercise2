package at.fh.swengb.kern.homeexercise2

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface NotesDao {
    @Insert
    fun insert(notes: Notes)

    @Query("SELECT * FROM notes")
    fun select():List<Notes>
}