package com.example.quotesapp.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quotesapp.controller.QuoteController
import com.example.quotesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: QuoteAdapter
    private lateinit var controller: QuoteController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        controller = QuoteController(lifecycleScope)

        adapter = QuoteAdapter(emptyList()) { quote ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("id", quote.id)
            startActivity(intent)
        }
        binding.rvQuotes.layoutManager = LinearLayoutManager(this)
        binding.rvQuotes.adapter = adapter

        binding.progress.visibility = View.VISIBLE
        controller.loadQuotes(
            limit = 50,
            onSuccess = { quotes ->
                binding.progress.visibility = View.GONE
                adapter.update(quotes)
            },
            onError = { message ->
                binding.progress.visibility = View.GONE
                Toast.makeText(this, "Error: $message", Toast.LENGTH_LONG).show()
            }
        )
    }
}