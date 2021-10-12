package abstract_factory

interface GUIFactory {
    fun createButton(): Button
    fun createCheckBox(): CheckBox
}