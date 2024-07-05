package ru.kpfu.itis.androidpractice24.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import ru.kpfu.itis.androidpractice24.homework2.databinding.FragmentCallingBinding

class CallingFragment : Fragment(R.layout.fragment_calling) {

    private var binding: FragmentCallingBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCallingBinding.bind(view)

        val phoneNumber = arguments?.getString(ARG_NUMBER)

        binding?.run {
            callingText.text = "${callingText.text}$phoneNumber"
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_NUMBER = "ARG_NUMBER"

        fun bundle(phoneNumber: String): Bundle = Bundle().apply {
            putString(ARG_NUMBER, phoneNumber)
        }
    }

}