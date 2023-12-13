package com.marsel.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : ViewModel>(@LayoutRes layoutId: Int) :
    Fragment(layoutId) {

    protected abstract val binding: VB
    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialize()
        setupView()
        setupListeners()
        setupRequest()
        setupSubscribe()
    }

    protected open fun initialize() {}

    protected open fun setupView() {}

    protected open fun setupListeners() {}

    protected open fun setupRequest() {}

    protected open fun setupSubscribe() {}
}