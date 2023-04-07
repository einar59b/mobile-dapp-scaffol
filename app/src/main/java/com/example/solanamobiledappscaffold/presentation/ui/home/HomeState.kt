package com.example.solanamobiledappscaffold.presentation.ui.home

import com.example.solanamobiledappscaffold.domain.model.Wallet
import java.math.BigDecimal

data class HomeState(
    val isLoading: Boolean = false,
    val isAuthorized: Boolean = false,
    val balance: BigDecimal = BigDecimal(0),
    val wallet: Wallet? = null,
    val error: String = "",
)
