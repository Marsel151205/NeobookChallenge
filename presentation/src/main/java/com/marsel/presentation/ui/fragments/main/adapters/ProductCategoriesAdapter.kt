package com.marsel.presentation.ui.fragments.main.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.marsel.presentation.databinding.ItemProductBinding
import com.marsel.presentation.modelsUI.ProductCategoryModelUI
import com.marsel.presentation.tools.BaseDiffUtilItemCallback

class ProductCategoriesAdapter :
    ListAdapter<ProductCategoryModelUI, ProductCategoriesAdapter.ProductCategoryViewHolder>(
        BaseDiffUtilItemCallback()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCategoryViewHolder =
        ProductCategoryViewHolder(
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: ProductCategoryViewHolder, position: Int) {
        getItem(position).let { holder.onBind(it) }
    }

    class ProductCategoryViewHolder(private val binding: ItemProductBinding) :
        ViewHolder(binding.root) {
        fun onBind(model: ProductCategoryModelUI) {
            Glide.with(binding.ivProduct).load(model.image).into(binding.ivProduct)
            binding.tvProductName.text = model.name
        }
    }
}