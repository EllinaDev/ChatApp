package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            Conversation(viewModel = viewModel,
                { viewModel.addMessage(it) },
                { viewModel.removeMessage(it) })
        }
    }


    data class Message(val author: String, val body: String)
}


