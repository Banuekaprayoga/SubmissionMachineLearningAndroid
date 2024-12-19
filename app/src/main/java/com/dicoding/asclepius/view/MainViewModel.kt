package com.dicoding.asclepius.view

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var currentImageUri: MutableLiveData<Uri?> = MutableLiveData(null)
}