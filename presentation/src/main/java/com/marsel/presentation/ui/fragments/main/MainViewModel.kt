package com.marsel.presentation.ui.fragments.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marsel.domain.tools.Either
import com.marsel.domain.usecases.GetProductCategoryUseCase
import com.marsel.presentation.modelsUI.ProductCategoryModelUI
import com.marsel.presentation.modelsUI.toUI
import com.marsel.presentation.tools.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getProductCategoryUseCase: GetProductCategoryUseCase
) : ViewModel() {

    private val _getProductCategory =
        MutableStateFlow<UIState<List<ProductCategoryModelUI>>>(UIState.Loading())
    val getProductCategory = _getProductCategory.asStateFlow()

    fun fetchProductCategory() {
        viewModelScope.launch {
            getProductCategoryUseCase().collect {
                when (it) {
                    is Either.Left -> {
                        _getProductCategory.value = UIState.Error(it.message)
                    }
                    is Either.Right -> {
                        _getProductCategory.value = UIState.Success(it.data.map { it.toUI() })
                    }
                }
            }
        }
    }
}