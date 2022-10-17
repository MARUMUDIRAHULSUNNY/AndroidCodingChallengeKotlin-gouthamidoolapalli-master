package com.commscope.codingchallengekt

fun validatePassword(input: String): Boolean {
    return input.length in 6..10 && input.contains("_") &&
            !input.contains("password", true) &&
            !input.contains("letmein", true)&&
            !input.contains("android", true)&&
            !input.contains("access", true)
}