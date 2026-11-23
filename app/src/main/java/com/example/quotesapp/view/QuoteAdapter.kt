package com.example.quotesapp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quotesapp.databinding.ItemQuoteBinding
import com.example.quotesapp.model.Quote

class QuoteAdapter(
    private var items: List<Quote>,
    private val onClick: (Quote) -> Unit
) : RecyclerView.Adapter<QuoteAdapter.VH>() {

    inner class VH(val b: ItemQuoteBinding) : RecyclerView.ViewHolder(b.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val b = ItemQuoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(b)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val q = items[position]
        holder.b.tvTitle.text = "Quote ${q.id}"
        holder.itemView.setOnClickListener { onClick(q) }
    }

    override fun getItemCount(): Int = items.size

    fun update(newItems: List<Quote>) {
        items = newItems
        notifyDataSetChanged()
    }
}