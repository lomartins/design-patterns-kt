package factory

class WindowsDialog: Dialog() {
    override fun createButton(): Button = WindowsButton()
}