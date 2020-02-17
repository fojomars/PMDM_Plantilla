package com.dam2.myapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    /**
     * Describe el ViewModel a la hora de creal un Fragment
     */
    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        "Hola mundo soy la sección: $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}