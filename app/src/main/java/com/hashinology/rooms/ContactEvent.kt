package com.hashinology.rooms

sealed interface ContactEvent{
    object SavaContact: ContactEvent
    data class setFirstName(val firstName: String): ContactEvent
    data class setLastName(val lastName: String): ContactEvent
    data class setPhoneName(val phoneNumber: String): ContactEvent
    object ShowDialog: ContactEvent
    object HideDialog: ContactEvent
    data class SortContact(val sortType: SortType): ContactEvent
    data class DeletContact(val contact: Contact): ContactEvent
}