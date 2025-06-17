# Exercise 7: Financial Forecasting with Recursive Algorithms

## Overview
This project implements a financial forecasting tool that uses recursive algorithms to predict future values based on historical data and growth patterns.

## 1. Understanding Recursive Algorithms

### What is Recursion?
Recursion is a programming technique where a function calls itself to solve a problem. It works by breaking down a complex problem into smaller, identical subproblems until it reaches a simple base case.

### Components of Recursion:
1. **Base Case** - The condition that stops the recursion
2. **Recursive Case** - The function calling itself with modified parameters

### How Recursion Simplifies Certain Problems:

The recursive nature makes the code more intuitive and easier to understand compared to iterative loops. The recursive approach directly mirrors the mathematical formula, making it easier to implement and debug.

## 4. Analysis: Time Complexity and Optimization

### Time Complexity Analysis

Our recursive algorithm has the following complexity:

**Time Complexity: O(n)** where n = number of periods
- Each recursive call performs constant time operations
- Total number of calls equals the number of periods

**Space Complexity: O(n)** 
- Each recursive call consumes stack memory
- Stack depth equals the number of periods

### Performance Implications:
For large numbers of periods (e.g., 1000+ years), the recursive approach may cause stack overflow errors due to excessive memory usage.

### Optimization Strategies

#### 1. Iterative Alternative
Convert the recursive solution to an iterative one for better memory efficiency:
```java
// Iterative approach: O(n) time, O(1) space
for (int i = 0; i < periods; i++) {
    result *= (1 + growthRate);
}
```


#### 3. Memoization
Store previously calculated results to avoid redundant computations when the same calculations are performed multiple times.

### Recommendation:
- Use recursion for educational purposes and when periods are small (< 100)
- Use iterative approach for large-scale production systems
- Use mathematical formulas for simple compound interest calculations

