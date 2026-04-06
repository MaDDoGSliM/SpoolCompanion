package com.hexxotest.spoolcompanion.network.data

import kotlinx.serialization.Serializable

// Raw Spoolman API model. Field names match JSON to avoid custom serializers.
@Serializable
data class SpoolItem(
    val archived: Boolean = false,
    val extra: Extra,
    val filament: Filament,
    val id: Int = -1,
    val initial_weight: Double = 0.0,
    val registered: String? = null,
    val remaining_length: Double = 0.0,
    val remaining_weight: Double = 0.0,
    val spool_weight: Double = 0.0,
    val used_length: Double = 0.0,
    val used_weight: Double = 0.0,
    val comment: String? = null,
    val lot_nr: String? = null,
    val location: String? = null
)
