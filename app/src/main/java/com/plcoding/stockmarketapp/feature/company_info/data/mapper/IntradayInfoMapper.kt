package com.plcoding.stockmarketapp.feature.company_list.data.mapper

import com.plcoding.stockmarketapp.feature.company_info.data.dto.IntradayInfoDto
import com.plcoding.stockmarketapp.feature.company_info.domain.model.IntradayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun IntradayInfoDto.toIntradayInfo(): IntradayInfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestamp, formatter)
    return IntradayInfo(
        date = localDateTime,
        close = close
    )
}