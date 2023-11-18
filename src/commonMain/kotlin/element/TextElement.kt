package element

import type.Arguments

class TextElement(val text: String) : Element {
    override fun compute(args: Arguments): String = text
}
