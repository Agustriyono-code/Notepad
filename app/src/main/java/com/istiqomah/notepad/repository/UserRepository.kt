package com.istiqomah.notepad.repository

import androidx.lifecycle.LiveData
import com.istiqomah.notepad.data.UserDao
import com.istiqomah.notepad.model.User

//membuat repository user dari data input

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User){
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User){
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUsers(){
        userDao.deleteAllUsers()
    }

}