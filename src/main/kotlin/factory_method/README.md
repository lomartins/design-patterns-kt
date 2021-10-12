# 🏭 Factory Method Pattern

*Factory is a creational design pattern that provides
an interface for creating objects in a super class.*

### The example
Imagine a situation where our application, need to support multiple platforms, like Windows and Web/HTML. Then we need to show a dialog with a button, but there different implementation of dialog and button for each platform. We can use factory_method pattern to solve this.

We create a *[Button](Button.kt)* interface and a *[Dialog](Dialog.kt)* abstract class which will be extended by each platform implementation *([HTMLDialog](HTMLDialog.kt) and [WindowsDialog](WindowsDialog.kt))*.

Each system have your own *Button* implementation *([HTMLButton](HTMLButton.kt) and [WindowsButton](WindowsButton.kt))* and each Dialog implementation return in `createButton` method the respective Button implementation.

The class [HTMLDialog](HTMLDialog.kt) implement the *createButton* method returning a [HTMLButton](HTMLButton.kt) which implement Button interface.
```
class HTMLDialog: Dialog() {
    override fun createButton(): Button = HTMLButton()
}
```

### Pros and Cons

- ✅ You avoid tight coupling between the creator and the concrete products.
- ✅ Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
- ✅ Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.
- ❌ The code may become more complicated since you need to introduce a lop of new subclasses to implement the pattern into an existing hierarchy of creator classes.


### References

- Refactoring - [Factory method](https://refactoring.guru/design-patterns/factory-method)
- Book - [Dive Into Design Patters](https://refactoring.guru/design-patterns/book)