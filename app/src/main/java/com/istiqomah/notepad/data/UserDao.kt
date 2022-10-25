package com.istiqomah.notepad.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.istiqomah.notepad.model.User
//file akan mengeksekusi data user di file model
//dan menampilkan dilayout custom_row
@Dao
interface UserDao {
//untuk menambahkan user
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)
//untuk mengupdate data
    @Update
    suspend fun updateUser(user: User)
//untk menghapus data di file custom_row
    @Delete
    suspend fun deleteUser(user: User)
//query untuk menghapus data melalui table user_table
    @Query("DELETE FROM user_table")
    suspend fun deleteAllUsers()

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>

}