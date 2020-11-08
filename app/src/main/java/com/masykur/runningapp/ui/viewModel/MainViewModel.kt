package com.masykur.runningapp.ui.viewModel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.masykur.runningapp.repositories.MainRepo

//untuk inject viewModel bgni caranya, karena
class MainViewModel @ViewModelInject constructor(val mainRepo: MainRepo) :ViewModel() {
}