package com.rememberdev.mysimplecleanarchitecture.di

import com.rememberdev.mysimplecleanarchitecture.data.IMessageDataSource
import com.rememberdev.mysimplecleanarchitecture.data.MessageDataSource
import com.rememberdev.mysimplecleanarchitecture.data.MessageRepository
import com.rememberdev.mysimplecleanarchitecture.domain.IMessageRepository
import com.rememberdev.mysimplecleanarchitecture.domain.MessageInteractor
import com.rememberdev.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase() : MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    fun provideRepository() : IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    fun provideDataSource() : IMessageDataSource{
        return MessageDataSource()
    }
}