package factory_method

class WindowsDialog: Dialog() {
    override fun createButton(): Button = WindowsButton()
}