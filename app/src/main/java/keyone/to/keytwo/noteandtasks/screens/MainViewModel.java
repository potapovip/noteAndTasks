package keyone.to.keytwo.noteandtasks.screens;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import keyone.to.keytwo.noteandtasks.App;
import keyone.to.keytwo.noteandtasks.model.Note;

public class MainViewModel extends ViewModel {
    private LiveData<List<Note>> noteLiveData = App.getInstance().getNoteDao().getAllLiveData();

    public LiveData<List<Note>> getNoteLiveData() {
        return noteLiveData;
    }
}
