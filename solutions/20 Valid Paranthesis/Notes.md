# Java Stack Problem - Valid Parentheses

This note explains key Java concepts used in the `isValid()` method for checking valid parentheses.

---

## 🔑 Keywords & Their Meanings

### 1. `class`
Defines a new class. Here, `Solution` is the name of the class.

### 2. `public`
Access modifier - means the method/class is accessible from other classes.

### 3. `boolean`
A primitive data type that returns either `true` or `false`.

### 4. `String`
A built-in Java class for handling text.

### 5. `Stack<Character>`
A stack data structure to store characters. Works on LIFO (Last-In-First-Out) principle.

### 6. `new Stack<>()`
Creates a new Stack object.

### 7. `for (int i = 0; i < s.length(); i++)`
A loop that iterates over the characters of the string.

### 8. `char`
A primitive data type for single characters.

### 9. `s.charAt(i)`
Returns the character at the `i-th` index of the string `s`.

### 10. `stack.push(ch)`
Adds an element to the top of the stack.

### 11. `stack.pop()`
Removes the top element from the stack.

### 12. `stack.peek()`
Returns the top element without removing it.

### 13. `stack.isEmpty()`
Returns `true` if the stack is empty.

### 14. `if / else if / else`
Conditional branching in Java.

### 15. `return`
Used to return a value from a method.

---

## ✅ Logic Summary

The code uses a stack to check if every opening bracket has a correct corresponding closing bracket in the correct order.
