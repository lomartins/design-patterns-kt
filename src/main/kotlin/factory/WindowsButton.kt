package factory

class WindowsButton: Button {
    private var onClick: () -> Unit = { }

    override fun render() {
        println("$this: Windows button rendered.")
    }

    override fun setOnClickListener(f: () -> Unit) {
        onClick = f
    }

    override fun click() {
        onClick.invoke()
    }
}