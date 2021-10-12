# 🧑‍🏭‍ Abstract Factory 🏭 🏭 🏭

***Abstract Factory** is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.*

#### Difference
The main difference between a **"[factory method](../factory_method)"** and an **"abstract factory"** is that the factory method is a single method, and an abstract factory is an object.

The factory method is just a method, it can be overridden in a subclass, whereas the abstract factory is an object that has multiple factory methods on it.

### The example
Imagine that you're creating a gui with a button and a checkbox for multiple OS (operational system), and each OS have your own button and checkbox implementation.

To implement the abstract factory we need a factory interface, that in our case is the *[GUIFactory](GUIFactory.kt)*. And each system will have your own Factory, *[WinFactory](windows/WinFactory.kt)* and *[LinuxFactory](linux/LinuxFactory.kt)*.

In the create methods of the *[GUIFactory](GUIFactory.kt)* interface we need to specify the interface for each product of the factory: *[Button](Button.kt)* and *[CheckBox](CheckBox.kt)*.

And then each OS need to have your own Button and CheckBox implementation.

### References
- GeeksForGeeks - [Abstract Factory Pattern](https://www.geeksforgeeks.org/abstract-factory-pattern/)
- Refactoring - [Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)
- Book - [Dive Into Design Patters](https://refactoring.guru/design-patterns/book)
