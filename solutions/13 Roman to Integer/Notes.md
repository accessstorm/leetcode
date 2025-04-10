# 🧠 Roman to Integer - Java Solution Explained

This Java program converts a Roman numeral string into its integer value using simple logic and data structures.

### 🧩 Explanation of Key Components

| **Keyword / Component**                         | **Description**                                                                 |
|--------------------------------------------------|---------------------------------------------------------------------------------|
| `class Solution`                                | Defines a class named `Solution`, commonly used in LeetCode submissions.        |
| `public int romanToInt(String s)`               | A public method that takes a Roman numeral string and returns its integer value.|
| `Map<Character, Integer> map = new HashMap<>();`| Initializes a map to store Roman characters and their corresponding values.     |
| `map.put(...)`                                  | Adds key-value pairs like `'I' → 1`, `'V' → 5` into the map.                    |
| `char chars[] = s.toCharArray();`               | Converts the input string into a character array for easy indexing.             |
| `int result = 0;`                               | Stores the final integer result.                                               |
| `for (i = 0, j = 1; j < chars.length; i++, j++)`| Iterates through the character array with two pointers to compare values.       |
| `if (map.get(chars[i]) >= map.get(chars[j]))`   | If current value is greater or equal to next, add it to the result.             |
| `else result -= map.get(chars[i]);`             | If current value is less than next, subtract it (e.g., for `IV` or `IX`).       |
| `result += map.get(chars[i]);`                  | After loop, add the last character’s value to the result.                       |
| `return result;`                                | Returns the final computed integer.                                            |

