package factory_method

class HTMLButton: Button {
    private var onClick: () -> Unit = { }

    override fun render() {
        println("$this: HTML button rendered.")
    }

    override fun setOnClickListener(f: () -> Unit) {
        onClick = f
    }

    override fun click() {
        onClick.invoke()
    }
}