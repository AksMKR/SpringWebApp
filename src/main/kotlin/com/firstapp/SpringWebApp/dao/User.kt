package com.firstapp.SpringWebApp.dao

data class User(val username: String, val password: String) {
    constructor() : this("", "")
}