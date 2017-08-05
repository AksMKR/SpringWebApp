package com.firstapp.SpringWebApp.controllers

import com.firstapp.SpringWebApp.dao.User
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountController {

    val currentUser = User("admin", "1234")

    @RequestMapping("/me")
    fun aboutMe(): User {
        return currentUser
    }

    @PostMapping("/validate")
    fun validate(@RequestBody user: User): Map<String, Boolean> {
        println(user)
        val param = mapOf("status" to (currentUser == user))
        return param
    }
}