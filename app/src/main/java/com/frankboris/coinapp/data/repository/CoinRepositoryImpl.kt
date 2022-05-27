package com.frankboris.coinapp.data.repository

import com.frankboris.coinapp.data.remote.CoinPaprikaApi
import com.frankboris.coinapp.data.remote.dto.CoinDetailDto
import com.frankboris.coinapp.data.remote.dto.CoinDto
import com.frankboris.coinapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}