package factory_method

class HTMLDialog: Dialog() {
    override fun createButton(): Button = HTMLButton()
}