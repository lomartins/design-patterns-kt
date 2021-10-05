package factory

abstract class Dialog {
    var button: Button? = null

    abstract fun createButton(): Button

    fun render() {
        button = createButton()
        button?.setOnClickListener {
            println("$button clicked")
        }
        button?.render()
    }
}