package com.plcoding.stockmarketapp.shared.parser

import java.io.InputStream

interface CSVParser<T> {
    suspend fun parse(stream: InputStream): List<T>
}