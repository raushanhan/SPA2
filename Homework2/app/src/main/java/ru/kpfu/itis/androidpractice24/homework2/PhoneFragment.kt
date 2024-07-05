package ru.kpfu.itis.androidpractice24.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import ru.kpfu.itis.androidpractice24.homework2.databinding.FragmentPhoneBinding

class PhoneFragment : Fragment(R.layout.fragment_phone) {

    private var binding: FragmentPhoneBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPhoneBinding.bind(view)

        binding?.run {
            callButton.setOnClickListener {
                when {
                    !enterText.text.isNullOrEmpty() -> {
                        findNavController().navigate(
                            resId = R.id.action_phoneFragment_to_callingFragment,
                            args = CallingFragment.bundle(
                                phoneNumber = enterText.text.toString()
                            )
                        )
                    }

                    else -> Snackbar.make(
                        root,
                        "To call you need to type in the number",
                        Snackbar.LENGTH_LONG
                    ).show()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}