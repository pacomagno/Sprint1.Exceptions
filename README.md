# 🎓 Java OOP & Exception Handling Exercises
**👨‍💻 Author:** Alejandro Garcia
**🧠 Learning Focus:** Object-Oriented Programming & Exception Handling
**🛠️ IDE:** IntelliJ IDEA
**💡 Java SDK:** 21

## 📘 Level 1 Exercises

### 🛍️ Exercise 1 - Product Sale System
Create classes to manage product sales with custom exceptions:

1. **Product Class**
- Attributes:
  - name (String)
  - price (double)

2. **Sale Class**
- Attributes:
  - products (Collection<Product>)
  - totalPrice (double)
- Methods:
  - calculateTotal() throws EmptySaleException

3. **EmptySaleException** (Custom Exception)
- Extends Exception
- Constructor message: "To make a sale you must first add products"

Requirements:
✔ Throw EmptySaleException for empty sales
✔ Handle IndexOutOfBoundsException
✔ Use getMessage() for error display
✔ Correctly calculate totals

## 📘 Level 2 Exercises

### ⌨️ Exercise 1 - Input Validation Class
Create an Input class to handle keyboard input exceptions.

**Number Input Methods (handle InputMismatchException):**
- readByte(String message)
- readInt(String message)
- readFloat(String message) 
- readDouble(String message)

**Text Input Methods (handle InvalidInputException):**
- readChar(String message)
- readString(String message) 
- readSiNo(String message) // "s"=true, "n"=false

Key Features:
✔ Auto-reprompt on errors
✔ Clear error messages
✔ Locale-aware number parsing
✔ Consistent prompts

## 💻 Technologies
☕ Java 21
🧠 IntelliJ IDEA
🗃️ Git & GitHub

## 📋 Requirements
✅ Java JDK 21
✅ IntelliJ IDEA
✅ Git

## 🛠️ Installation
1. Clone repository:
git clone https://github.com/<user>/java-exercises.git
2. Open in IntelliJ
3. Set JDK 21

## ▶️ Execution
- Run Main classes in each level package
- Test all exception cases

## 🤝 Contributions
Welcome! Please:
🪄 Fork → Improve → PR
⭐ Star if helpful
🐛 Report issues

## 🎯 Learning Outcomes
◾ OOP principles
◾ Custom exceptions
◾ Input validation
◾ Error recovery
◾ Collection management

Thanks for visiting! 🚀
