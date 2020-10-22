package id.ac.ui.cs.mobileprogramming;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class AppViewModel extends ViewModel {

    private AppRepo appRepo;
    private MutableLiveData<List<TextModel>> mutableLiveData;

    public AppViewModel() {
        appRepo = new AppRepo();
    }

    public LiveData<List<TextModel>> getTexts() {
        if (mutableLiveData == null) {
            mutableLiveData = appRepo.requestText();
        }
        return mutableLiveData;
    }

}
