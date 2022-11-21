package com.materialtools.notes.models

import java.time.LocalDate

data class Note(
    val title: String,
    val details: String,
    val createdAt: LocalDate,
    val modifiedAt: LocalDate,
)
