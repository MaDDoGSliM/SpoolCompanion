package com.hexxotest.spoolcompanion.network.data

import kotlinx.serialization.Serializable

// Raw vendor model from Spoolman API.
@Serializable
data class Vendor(
    val external_id: String? = null,
    val extra: Extra,
    val id: Int = -1,
    val name: String? = null,
    val registered: String? = null
)
