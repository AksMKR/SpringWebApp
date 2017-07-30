package com.firstapp.SpringWebApp.controllers

import com.firstapp.SpringWebApp.dao.User
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController {

    val user = User("admin", "1234")

    @RequestMapping("/me")
    fun aboutMe(): User {
        return user
    }
}