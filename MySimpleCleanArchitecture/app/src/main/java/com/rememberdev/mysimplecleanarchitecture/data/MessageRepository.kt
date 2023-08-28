package com.rememberdev.mysimplecleanarchitecture.data

import com.rememberdev.mysimplecleanarchitecture.domain.IMessageRepository
import com.rememberdev.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) =  messageDataSource.getMessageFromSource(name)
}