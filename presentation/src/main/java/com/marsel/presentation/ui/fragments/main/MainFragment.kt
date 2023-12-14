package com.marsel.presentation.ui.fragments.main

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.marsel.presentation.R
import com.marsel.presentation.base.BaseFragment
import com.marsel.presentation.databinding.FragmentMainBinding
import com.marsel.presentation.tools.UIState
import com.marsel.presentation.ui.fragments.main.adapters.ProductCategoriesAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(R.layout.fragment_main) {

    override val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)
    override val viewModel: MainViewModel by viewModels()
    private val productCategoryCategoriesAdapter = ProductCategoriesAdapter()

    override fun setupView() {
        binding.rvProductCategory.adapter = productCategoryCategoriesAdapter
    }

    override fun setupRequest() {
        lifecycleScope.launch {
            viewModel.fetchProductCategory()
        }
    }

    override fun setupSubscribe() {
        lifecycleScope.launch {
            viewModel.getProductCategory.collect {
                when (it) {
                    is UIState.Error -> {
                        Log.e("marsel", "setupSubscribe: ${it.error}")
                    }

                    is UIState.Success -> {
                        productCategoryCategoriesAdapter.submitList(it.data)
                    }

                    is UIState.Loading -> {
                        Log.e("marsel", it.toString())
                    }
                }
            }
        }
    }
}