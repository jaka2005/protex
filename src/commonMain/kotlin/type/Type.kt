package type

typealias Arguments = HashMap<String, Type>

sealed class Type

data class ProtexInt(val num: Int) : Type()
data class ProtexString(val str: String) : Type()

data class Variants(val vars: List<Variant>) : Type() {
    data class Variant(val name: String)
}
