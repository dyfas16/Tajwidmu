package com.tajwidmu

data class Pertanyaan(
    val id: Int,
    val pertanyaan: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val trueReply: Int,
)