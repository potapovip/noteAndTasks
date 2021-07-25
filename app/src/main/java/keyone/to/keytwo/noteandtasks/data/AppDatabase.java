package keyone.to.keytwo.noteandtasks.data;

import androidx.room.Database;

import keyone.to.keytwo.noteandtasks.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    public  abstract NoteDao noteDao();
}
