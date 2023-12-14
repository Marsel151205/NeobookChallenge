package com.marsel.presentation.tools

interface BaseDiffModel<T> {
    val id: T?
    override fun equals(other: Any?): Boolean
}