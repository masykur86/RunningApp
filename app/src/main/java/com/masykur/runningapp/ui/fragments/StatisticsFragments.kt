package com.masykur.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.masykur.runningapp.R
import com.masykur.runningapp.ui.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragments : Fragment(R.layout.fragment_statistics) {
    private val viewModel: MainViewModel by viewModels()
}