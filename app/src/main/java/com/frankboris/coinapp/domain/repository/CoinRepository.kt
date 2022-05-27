package com.frankboris.coinapp.domain.repository

import com.frankboris.coinapp.data.remote.dto.CoinDetailDto
import com.frankboris.coinapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}