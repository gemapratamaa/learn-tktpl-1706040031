package id.ac.ui.cs.mobileprogramming;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class AppRepo {

    private final String TAG = getClass().getSimpleName();

    public MutableLiveData<List<TextModel>> requestText() {
        final MutableLiveData<List<TextModel>> mutableLiveData = new MutableLiveData<>();
        return mutableLiveData;
    }
}
