package com.frankboris.coinapp.presentation.coin_list

import com.frankboris.coinapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
