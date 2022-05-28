package com.frankboris.coinapp.presentation.coin_list.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.frankboris.coinapp.domain.model.Coin

@Composable
fun CoinList(
    coins: List<Coin>,
    onItemClick: (Coin) -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(coins) { coin ->
            CoinListItem(
                coin = coin,
                onItemClick
            )
        }
    }
}