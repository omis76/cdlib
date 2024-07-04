package com.cdtest.cdlib


fun String.formatStringToDouble(default: Double = 0.0): Double {
    try {
        val res = this.toDouble()
        return res
    } catch (e: Exception) {
        return default
    }
}