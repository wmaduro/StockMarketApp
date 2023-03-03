package com.plcoding.stockmarketapp.feature.company_list.data.mapper

import com.plcoding.stockmarketapp.feature.company_info.domain.model.CompanyInfo
import com.plcoding.stockmarketapp.feature.company_list.data.dto.CompanyInfoDto
import com.plcoding.stockmarketapp.feature.company_list.domain.model.CompanyListing
import com.plcoding.stockmarketapp.shared.data.local.database.CompanyListingEntity

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}