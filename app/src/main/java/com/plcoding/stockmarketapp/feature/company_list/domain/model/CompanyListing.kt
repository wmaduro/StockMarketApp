package com.plcoding.stockmarketapp.feature.company_list.domain.model

data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String,
)
