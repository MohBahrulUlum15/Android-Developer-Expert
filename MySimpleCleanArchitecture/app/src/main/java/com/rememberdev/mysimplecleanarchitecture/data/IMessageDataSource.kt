package com.rememberdev.mysimplecleanarchitecture.data

import com.rememberdev.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}