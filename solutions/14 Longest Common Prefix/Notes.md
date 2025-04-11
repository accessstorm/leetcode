Youtube Link - https://youtu.be/4n2tr2C7c_w

🔠 Longest Common Prefix - Java Solution Explained
This document explains the logic behind the Longest Common Prefix Java solution, along with key Java keywords and concepts used in the implementation.

📌 Problem Summary
Given an array of strings, find the longest common prefix among all the strings. If there is none, return an empty string "".


### 🔑 Keywords & Explanation

| **Keyword / Concept**                    | **Explanation**                                                                 |
|-----------------------------------------|---------------------------------------------------------------------------------|
| `class`                                 | Declares a class in Java. In this case, `Solution` is the class name.          |
| `public`                                | Access modifier that allows the method to be accessed from anywhere.           |
| `String`                                | A built-in Java class representing text data.                                  |
| `longestCommonPrefix`                   | The method name which returns the longest common prefix.                       |
| `String[] strs`                         | Parameter passed to the method: an array of strings.                           |
| `if (strs.length == 0 || strs == null)` | Edge case check to return an empty string if input is invalid.                |
| `return ""`                             | Returns an empty string if no common prefix exists or input is invalid.        |
| `for (int i = 0; i < strs[0].length(); i++)` | Outer loop iterating character-by-character through the first string.     |
| `char ch = strs[0].charAt(i)`           | Extracts the character at position `i` from the first string.                  |
| `charAt(i)`                             | Java method used to access a character at a specific index in a string.        |
| `for (int j = 1; j < strs.length; j++)` | Inner loop comparing the current character with others across all strings.     |
| `strs[j].charAt(i) != ch`               | Checks for mismatch in character at current position.                          |
| `strs[0].substring(0, i)`               | Returns the substring from start to current index if a mismatch is found.      |
| `substring(0, i)`                       | Java method that returns part of the string between index 0 and `i`.           |
