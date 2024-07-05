package ru.kpfu.itis.androidpractice24.homework2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import ru.kpfu.itis.androidpractice24.homework2.databinding.ItemContactBinding

class ContactHolder(
    private val binding: ItemContactBinding,
    private val glide: RequestManager,
    private val onClick: (Int) -> Unit,
): ViewHolder(binding.root) {

    fun onBind(contact: Contact) {
        binding.run {
            tvContact.text = contact.name
            tvPhoneNumber.text = contact.phoneNumber

            glide
                .load(contact.url)
                .error(R.drawable.baseline_person_24)
                .placeholder(R.drawable.baseline_person_24)
                .into(ivPhoto)

            root.setOnClickListener {
                onClick.invoke(contact.id)
            }
        }
    }
}