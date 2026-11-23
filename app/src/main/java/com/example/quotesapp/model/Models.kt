package com.example.quotesapp.model

data class Quote(
    val id: Int,
    val quote: String,
    val author: String
)

data class QuotesResponse(
    val quotes: List<Quote>,
    val total: Int,
    val skip: Int,
    val limit: Int
)