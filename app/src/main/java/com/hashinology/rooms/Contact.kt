package com.hashinology.rooms

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    val firstNAme: String,
    val lastName: String,
    val phoneNumber: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)
