package com.commscope.codingchallengekt.utils

import kotlin.math.pow

fun calculatePiUtil(): Double {
    val n = 40000000 // number of calculations to run

    var pi = 0.0
    for (i in 1..n) {
        pi += (-1.0).pow((i + 1).toDouble()) / (2 * i - 1)
    }
    return 4 * pi
}