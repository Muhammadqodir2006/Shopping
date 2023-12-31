package uz.itschool.shopping.model

data class Cart(
    val discountedTotal: Int,
    val id: Int,
    val products: List<ProductX>,
    val total: Int,
    val totalProducts: Int,
    val totalQuantity: Int,
    val userId: Int
)