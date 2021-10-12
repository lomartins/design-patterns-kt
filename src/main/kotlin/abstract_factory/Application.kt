package abstract_factory

class Application(private val factory: GUIFactory) {
    private var button: Button? = null
    private var checkBox: CheckBox? = null

    fun createUI() {
        button = factory.createButton()
        checkBox = factory.createCheckBox()
    }

    fun paint() {
        button?.paint()
        checkBox?.paint()
    }
}