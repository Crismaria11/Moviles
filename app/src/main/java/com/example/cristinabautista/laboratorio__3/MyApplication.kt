package com.example.cristinabautista.laboratorio__3

import android.app.Application

class MyApplication: Application() {
    private var contact: ArrayList<Contact> = ArrayList()

    fun add(name: String, number:Int) {
        val contact: Contact = Contact(name; number)
        this.contact.add(contact)
    }

}