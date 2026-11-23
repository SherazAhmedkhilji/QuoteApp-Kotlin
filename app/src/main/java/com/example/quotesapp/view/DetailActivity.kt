package com.example.quotesapp.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.quotesapp.controller.QuoteController
import com.example.quotesapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var controller: QuoteController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("id", 1)

        // Toolbar with back arrow
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Quote $id"

        controller = QuoteController(lifecycleScope)

        controller.loadQuoteDetail(
            id = id,
            onSuccess = { quote ->
                binding.tvDetailQuote.text = "“${quote.quote}”"
                binding.tvDetailAuthor.text = "— ${quote.author}"
            },
            onError = { message ->
                Toast.makeText(this, "Error: $message", Toast.LENGTH_LONG).show()
            }
        )
    }

    // Back arrow click
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}