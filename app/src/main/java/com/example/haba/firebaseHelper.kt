package com.example.haba

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


fun dbaccess(){
    // Write a message to the database
    val database = Firebase.database
    val myRef = database.getReference("message")

    myRef.setValue("Hello, World!")
}