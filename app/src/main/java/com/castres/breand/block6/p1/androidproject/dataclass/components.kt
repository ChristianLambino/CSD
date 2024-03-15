package com.castres.breand.block6.p1.androidproject.dataclass

data class Components(
    val CPU: List<CPU>,
    val GPU: List<GPU>,
    val Monitor: List<Any>
)

data class GPU(
    val category: String,
    val created_at: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: String,
    val prod_name: String,
    val updated_at: String
)
data class CPU(
    val category: String,
    val created_at: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: String,
    val prod_name: String,
    val updated_at: String
)