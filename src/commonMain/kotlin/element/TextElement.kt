package element

class TextElement(val text: String) : Element {
    override fun compute(): String = text
}
