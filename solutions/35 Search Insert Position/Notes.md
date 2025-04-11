Youtube Link - https://youtu.be/0lasvTaIqBA

# 🔍 Java Binary Search - Notes

## Keywords and Their Meanings

| Keyword        | Meaning                                                                 |
|----------------|-------------------------------------------------------------------------|
| `class`        | Declares a new class in Java.                                           |
| `public`       | Access modifier; makes the class/method accessible from other classes.  |
| `int`          | Primitive data type to store integers.                                  |
| `[]`           | Denotes an array in Java.                                               |
| `searchInsert` | Method name defined to solve the problem.                              |
| `=`            | Assignment operator; assigns value to a variable.                       |
| `+`, `-`, `/`  | Arithmetic operators for addition, subtraction, and division.           |
| `while`        | Loop that continues as long as the condition is true.                   |
| `<=`           | Less than or equal to comparison operator.                              |
| `if`, `else`   | Conditional statements for decision-making.                             |
| `return`       | Exits from the method and optionally returns a value.                   |

## Logic Summary

The code uses **binary search** to find the `target` or the correct **insert position** in a sorted array. If the `target` is not found, it returns the position where it would be inserted to maintain the sorted order.

```java
int mid = left + (right - left) / 2;
