package com.informatika.nisaoktarina_19100014_parkir.model

import com.google.gson.annotations.SerializedName

data class ResponseActionBarang(

	@field:SerializedName("pesan")
	val pesan: String? = null,

	@field:SerializedName("data")
	val data: List<Boolean?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
