package type

import kotlin.jvm.JvmInline

typealias Arguments = HashMap<String, Type<*>>

sealed class Type<T> {
    open fun getInstance(value: T): T {
        return value
    }
}

data object ProtexInt : Type<Int>()

data object ProtexString : Type<String>()

data class Variants(val vars: List<Variant>) : Type<Variants.Variant>() {
    @JvmInline
    value class Variant(private val name: String)

    fun getInstance(value: String) = getInstance(Variant(value))

    override fun getInstance(value: Variant): Variant {
        if (value in vars) {
            return value
        } else {
            throw IllegalArgumentException("Variant with this name was not found")
        }
    }
}
