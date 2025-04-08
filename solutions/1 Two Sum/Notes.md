# 🧮 Two Sum Problem (Java)

## 📝 Problem Statement

Given an array of integers `nums` and an integer `target`, return the **indices** of the **two numbers** such that they add up to the target.

You may assume that each input would have **exactly one solution**, and you **may not use the same element twice**.

---

## 💡 Example

```java
Input: nums = [2, 7, 11, 15], target = 9  
Output: [0, 1]  
Explanation: nums[0] + nums[1] == 2 + 7 == 9
✅ Java Code
java
Copy
Edit
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No match");
    }
}
🔑 Keywords & Explanations
Keyword	Explanation
class	Defines a blueprint for the Solution class.
public	Access modifier meaning the method is visible to all.
int[]	Array of integers.
Map<K, V>	Stores key-value pairs (like a dictionary).
HashMap<>()	A type of Map which stores items with fast lookup.
for (int i = 0; ...)	A loop to go through the array.
target - nums[i]	Calculates the number needed to complete the pair.
map.containsKey(value)	Checks if a specific key exists in the map.
map.get(key)	Retrieves the value associated with a key.
map.put(key, value)	Stores a key-value pair in the map.
throw new ...	Throws an error if no solution is found.
⚙️ How It Works
Loop through the array.

For each element, calculate the complement needed to reach the target.

Check if that complement has already been seen (stored in the map).

If yes, return the stored index and current index.

If not, store the current number and its index in the map.

🧠 Time & Space Complexity
Time: O(n) — One pass through the array.

Space: O(n) — HashMap stores up to n elements.

