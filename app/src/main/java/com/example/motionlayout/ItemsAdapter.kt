package com.example.motionlayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.databinding.RowItemBinding

class ItemsAdapter : RecyclerView.Adapter<ItemViewHolder>() {

    private val list = listOf(
        "Nuts",
        "Fresh Fruit",
        "Potatoes",
        "Green pepper",
        "Onions",
        "Mushrooms",
        "Iceberg",
        "Carrots",
        "Tomatoes",
        "Hot Dog Sausages"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

}

class ItemViewHolder(private val binding: RowItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.label.text = item
    }
}