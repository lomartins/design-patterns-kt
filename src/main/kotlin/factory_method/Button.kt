package factory_method

interface Button {
    fun render()
    fun setOnClickListener(f: () -> Unit)
    fun click()
}