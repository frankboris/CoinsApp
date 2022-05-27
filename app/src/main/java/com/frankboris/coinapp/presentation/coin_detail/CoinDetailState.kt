package com.frankboris.coinapp.presentation.coin_detail

import com.frankboris.coinapp.domain.model.Coin
import com.frankboris.coinapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
