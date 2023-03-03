package com.plcoding.stockmarketapp.feature.company_info.domain.model

import java.time.LocalDateTime

data class IntradayInfo(
    val date: LocalDateTime,
    val close: Double
)
