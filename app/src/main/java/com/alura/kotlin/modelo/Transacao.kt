package com.alura.kotlin.modelo

import java.math.BigDecimal
import java.util.*

class Transacao(
    val valor: BigDecimal,
    val categoria: String = "indefinida",
    val tipo: Tipo,
    val data: Calendar = Calendar.getInstance()
) {}