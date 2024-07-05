package ru.kpfu.itis.androidpractice24.homework2

data class Contact(
    val id: Int,
    val name: String,
    val phoneNumber: String,
    val creationDate: String,
    val lastCalled: String,
    val isEmergencyContact: Boolean,
    val url: String,
)