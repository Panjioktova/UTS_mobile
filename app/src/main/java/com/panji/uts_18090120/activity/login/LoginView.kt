package com.panji.uts_18090120.activity.login

import com.panji.uts_18090120.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}