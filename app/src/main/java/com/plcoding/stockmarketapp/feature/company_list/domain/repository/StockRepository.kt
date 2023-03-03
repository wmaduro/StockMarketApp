package com.plcoding.stockmarketapp.feature.company_list.domain.repository

import com.plcoding.stockmarketapp.feature.company_info.domain.model.CompanyInfo
import com.plcoding.stockmarketapp.feature.company_info.domain.model.IntradayInfo
import com.plcoding.stockmarketapp.feature.company_list.domain.model.CompanyListing

import com.plcoding.stockmarketapp.shared.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}