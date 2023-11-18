import element.Element
import type.Arguments

class TextBuilder {
    private val elements = ArrayDeque<Element>()

    fun append(element: Element) {
        elements.add(element)
    }

    fun build(args: Arguments): String {
        val builder = StringBuilder()
        elements.forEach {
            // TODO: I can track individual argument preferences for each function
            builder.append(it.compute(args))
        }

        return builder.toString()
    }
}
