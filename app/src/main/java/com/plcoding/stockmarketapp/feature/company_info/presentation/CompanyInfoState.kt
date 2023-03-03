package com.plcoding.stockmarketapp.feature.company_info.presentation

import com.plcoding.stockmarketapp.feature.company_info.domain.model.CompanyInfo
import com.plcoding.stockmarketapp.feature.company_info.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
