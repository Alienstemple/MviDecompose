package com.example.mvidecomposetest.presentation

import kotlinx.coroutines.flow.StateFlow

interface AddContactComponent {

    val model: StateFlow<Model>

    fun onUsernameChanged(username: String)

    fun onPhoneChanged(phone: String)

    fun onSaveContentClicked()

    data class Model (
        val username: String,
        val phone: String
    )
}