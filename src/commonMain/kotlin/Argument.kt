import type.Type

data class Argument<T : Type>(val name: String, val data: T)
