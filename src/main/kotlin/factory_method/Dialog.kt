package factory_method

abstract class Dialog {
    var button: Button? = null

    protected abstract fun createButton(): Button

    fun render() {
        button = createButton()
        button?.setOnClickListener {
            println("$button clicked")
        }
        button?.render()
    }
}