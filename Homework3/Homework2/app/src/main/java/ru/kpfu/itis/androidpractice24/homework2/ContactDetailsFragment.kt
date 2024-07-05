package ru.kpfu.itis.androidpractice24.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import ru.kpfu.itis.androidpractice24.homework2.databinding.FragmentContactDetailsBinding


class ContactDetailsFragment : Fragment(R.layout.fragment_contact_details) {


    private var binding: FragmentContactDetailsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContactDetailsBinding.bind(view)

        var list = ContactRepository.contacts
        val myId = arguments?.getString(ARG_ID)
        val foundItem = list.find {it.id == myId?.toInt()}


        binding?.run {

            btnBack.setOnClickListener {

                findNavController().navigate(
                    resId = R.id.action_contactDetailsFragment_to_contactsFragment)
            }

            binding!!.tvContact.text = foundItem!!.name
            binding!!.tvPhoneNumber.text = foundItem.phoneNumber
            binding!!.tvDescription.text = createContactDetails(foundItem)

            Glide.with(ivPhoto.context)
                .load(foundItem.url)
                .into(ivPhoto)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun createContactDetails(contact: Contact) = "created: ${contact.creationDate}\n" +
            "last called: ${contact.lastCalled}\n" +
            "emergency contact: ${if (contact.isEmergencyContact) "yes" else "no"}"

    companion object {

        private const val ARG_ID = "ARG_ID"

        fun bundle(id:String): Bundle = Bundle().apply {
            putString(ARG_ID, id)
        }
    }
}