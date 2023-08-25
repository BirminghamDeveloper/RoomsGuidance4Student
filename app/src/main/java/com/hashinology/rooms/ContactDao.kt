package com.hashinology.rooms

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {
    @Upsert
    suspend fun upsertContact(contact: Contact)
    @Delete
    suspend fun deleteContact(contact: Contact)
    @Query("SELECT * FROM contact ORDERED BY firstName ASC")
    suspend fun getContactOrderedByFirstName(): Flow<List<Contact>> // Flow of Coroutines
    @Query("SELECT * FROM contact ORDERED BY lasttName ASC")
    suspend fun getContactOrderedByLastName(): Flow<List<Contact>>
    @Query("SELECT * FROM contact ORDERED BY phoneNumber ASC")
    suspend fun getContactOrderedByPhoneNumber(): Flow<List<Contact>>
}