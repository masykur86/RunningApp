package com.masykur.runningapp.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.masykur.runningapp.R
import kotlinx.android.synthetic.main.fragment_setup.*

class SetupFragments :Fragment(R.layout.fragment_setup) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragments_to_runFragments)
            Toast.makeText(activity, "pindah fragment", Toast.LENGTH_SHORT).show()
        }
    }
}