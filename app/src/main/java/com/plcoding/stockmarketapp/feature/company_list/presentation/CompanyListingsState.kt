package com.plcoding.stockmarketapp.feature.company_list.presentation

import com.plcoding.stockmarketapp.feature.company_list.domain.model.CompanyListing


data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)
