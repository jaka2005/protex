class Parser {
    fun parse(text: String): TextBuilder {
        val textBuilder = TextBuilder()
        val builder = StringBuilder()
        text.forEach {
            builder.append(it)
            // TODO: Add more handles for any elements
        }

        return textBuilder
    }
}
