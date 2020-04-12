package com.example.covid19.data.res

data class CoronaCount(
    val features: List<FeatureItem?>? = null
)

data class FeatureItem(
    val attributes: Attribute? = null
)

data class Attribute(
    val value: Int? = null
)