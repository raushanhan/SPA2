package ru.kpfu.itis.androidpractice24.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import ru.kpfu.itis.androidpractice24.homework2.databinding.FragmentContactsBinding

class ContactsFragment : Fragment(R.layout.fragment_contacts) {

    private var binding: FragmentContactsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContactsBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}