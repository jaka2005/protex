import element.Argument
import element.Element

class TextBuilder {
    private val elements = ArrayDeque<Element>()

    fun append(element: Element) {
        elements.add(element)
    }

    fun build(args: List<Argument<*>>): String {
        val builder = StringBuilder()
        elements.forEach {
            builder.append(it.compute())
        }

        return builder.toString()
    }
}
