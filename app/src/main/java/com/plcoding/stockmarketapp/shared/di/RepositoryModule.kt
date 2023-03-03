package com.plcoding.stockmarketapp.shared.di


import com.plcoding.stockmarketapp.feature.company_info.data.csv.IntradayInfoParser
import com.plcoding.stockmarketapp.feature.company_info.domain.model.IntradayInfo
import com.plcoding.stockmarketapp.feature.company_list.data.csv.CompanyListingsParser
import com.plcoding.stockmarketapp.feature.company_list.data.repository.StockRepositoryImpl
import com.plcoding.stockmarketapp.feature.company_list.domain.model.CompanyListing
import com.plcoding.stockmarketapp.feature.company_list.domain.repository.StockRepository
import com.plcoding.stockmarketapp.shared.parser.CSVParser
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}