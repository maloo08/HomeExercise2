package at.fh.swengb.kern.homeexercise2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNoteActivity : AppCompatActivity() {

    lateinit var db: NotesRoomDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        db = NotesRoomDatabase.getDatabase(this)
    }

    fun addNotes(view: View) {
        val title = addTitle.text.toString()
        val content = content.text.toString()

        val notes = Notes(title, content)

        db.notesDao.insert(notes)

        finish()
    }
}