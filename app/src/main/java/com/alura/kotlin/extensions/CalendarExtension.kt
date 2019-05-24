package com.alura.kotlin.extensions

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formatarParaBrasileiro():String{
    val formatoBroasileiro = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatoBroasileiro)
    return format.format(this.time)
}