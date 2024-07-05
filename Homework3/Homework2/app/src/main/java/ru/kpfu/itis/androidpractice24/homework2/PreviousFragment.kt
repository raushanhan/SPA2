package ru.kpfu.itis.androidpractice24.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import ru.kpfu.itis.androidpractice24.homework2.databinding.FragmentPreviousBinding

class PreviousFragment : Fragment(R.layout.fragment_previous) {

    private var binding: FragmentPreviousBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPreviousBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}