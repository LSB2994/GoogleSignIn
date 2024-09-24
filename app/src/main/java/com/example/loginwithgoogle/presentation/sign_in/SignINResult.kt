package com.example.loginwithgoogle.presentation.sign_in


data class SignINResult(
    val data: UserData?,
    val errorMessage: String?
)

data class UserData(
    val userId: String,
    val username: String?,
    val profilePictureUrl: String?,
)