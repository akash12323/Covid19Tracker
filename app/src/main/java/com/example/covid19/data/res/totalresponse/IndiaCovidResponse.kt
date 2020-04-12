package com.example.covid19.data.res.totalresponse

data class IndiaCovidResponse(
	val casesTimeSeries: List<CasesTimeSeriesItem>? = null,
	val tested: List<TestedItem>? = null,
	val statewise: List<StatewiseItem>? = null
)
