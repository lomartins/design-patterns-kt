package factory

class HTMLDialog: Dialog() {
    override fun createButton(): Button = HTMLButton()
}