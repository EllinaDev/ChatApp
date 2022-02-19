package com.example.compose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _messagesLiveData = MutableLiveData(listOf<MainActivity.Message>())
    val messagesLiveData: LiveData<List<MainActivity.Message>> = _messagesLiveData

    fun addMessage(message: MainActivity.Message) {
        _messagesLiveData.value = _messagesLiveData.value!! + listOf(message)
    }

    fun removeMessage(message: MainActivity.Message) {
        _messagesLiveData.value = _messagesLiveData.value!!.toMutableList().also {
            it.remove(message)
        }
    }
}