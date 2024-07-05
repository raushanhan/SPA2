package ru.kpfu.itis.androidpractice24.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import ru.kpfu.itis.androidpractice24.homework2.databinding.FragmentContactsBinding

class ContactsFragment : Fragment(R.layout.fragment_contacts) {

    private var binding: FragmentContactsBinding? = null

    private var adapter: ContactAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContactsBinding.bind(view)

        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        adapter = ContactAdapter(
            list = ContactRepository.contacts,
            glide = Glide.with(this),
            onClick = {id ->
                findNavController().navigate(
                    resId = R.id.action_contactsFragment_to_contactDetailsFragment,
                    args = ContactDetailsFragment.bundle(
                        id = id.toString()
                    )
                )
            }
        )

        binding?.run {
            rvContacts.adapter = adapter
            rvContacts.layoutManager = LinearLayoutManager(requireContext())
        }
    }

}