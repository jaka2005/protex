package element

import type.Arguments

sealed interface Element {
    fun compute(args: Arguments): String
}
