package com.example.roommvvm.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.roommvvm.entity.Student

@Dao
interface StudentDao {
//    fungsi untuk menampilkan seluruh data
    @Query("Select * from student")
    fun getAll(): List<Student>

//    fungsi untuk menambahkan data
    @Insert
    fun insertStudent(item: Student)
}