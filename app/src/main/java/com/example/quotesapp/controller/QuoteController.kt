package com.example.quotesapp.controller

import com.example.quotesapp.model.Quote
import com.example.quotesapp.model.RetrofitClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class QuoteController(private val scope: CoroutineScope) {

    // Loads the main list of quotes
    fun loadQuotes(
        limit: Int,
        onSuccess: (List<Quote>) -> Unit,
        onError: (String) -> Unit
    ) {
        scope.launch {
            try {
                val response = RetrofitClient.api.getQuotes(limit)
                onSuccess(response.quotes)
            } catch (e: Exception) {
                onError(e.message ?: "Something went wrong")
            }
        }
    }

    // Loads one quote
    fun loadQuoteDetail(
        id: Int,
        onSuccess: (Quote) -> Unit,
        onError: (String) -> Unit
    ) {
        scope.launch {
            try {
                val quote = RetrofitClient.api.getQuote(id)
                onSuccess(quote)
            } catch (e: Exception) {
                onError(e.message ?: "Something went wrong")
            }
        }
    }
}