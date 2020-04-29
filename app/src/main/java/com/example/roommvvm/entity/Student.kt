package com.example.roommvvm.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

//class ini berfungsi untuk menginisiasi table Student

data class Student (
    @PrimaryKey(autoGenerate = true) var id: Int? = null,

    @ColumnInfo var name: String = ""
)