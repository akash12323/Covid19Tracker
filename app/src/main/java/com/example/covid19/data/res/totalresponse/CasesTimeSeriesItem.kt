package com.example.covid19.data.res.totalresponse

data class CasesTimeSeriesItem(
	val date: String? = null,
	val dailyrecovered: String? = null,
	val totalconfirmed: String? = null,
	val totaldeceased: String? = null,
	val dailydeceased: String? = null,
	val totalrecovered: String? = null,
	val dailyconfirmed: String? = null
)
