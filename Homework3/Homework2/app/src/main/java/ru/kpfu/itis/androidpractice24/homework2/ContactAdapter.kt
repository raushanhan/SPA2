package ru.kpfu.itis.androidpractice24.homework2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import ru.kpfu.itis.androidpractice24.homework2.databinding.ItemContactBinding

class ContactAdapter(
    private val list: List<Contact>,
    private val glide: RequestManager,
    private val onClick: (Int) -> Unit
) : RecyclerView.Adapter<ContactHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactHolder = ContactHolder(
        binding = ItemContactBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onClick = onClick,
    )

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        holder.onBind(list[position])
    }

}