# 1326. Minimum Number of Taps to Open to Water a Garden

## Problem Link

https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/

---

# Problem Statement

There is a garden from:

```text
0 → n
```

There are:
```text
n + 1 taps
```

Every tap can water some interval.

If:
```text
ranges[i] = x
```

then tap `i` can water:

```text
[i-x , i+x]
```

We need:
```text
minimum taps
```

to completely water the garden.

If impossible:
```text
return -1
```

---

# Core Intuition

This is NOT actually a DP problem.

This is:
```text
Greedy + Interval Coverage
```

problem.

---

# Real Transformation

Every tap becomes an interval.

Example:

```text
tap = 3
range = 2
```

Coverage:

```text
[1,5]
```

So actual problem becomes:

```text
minimum intervals needed
to cover [0,n]
```

---

# Main Greedy Thinking

At every step:

```text
jitne intervals current coverage ke andar start ho rahe
```

unme:

```text
jo sabse farthest right tak jaye
```

use choose karo.

Exactly same intuition as:
```text
Jump Game II
```

---

# Important Variables

## currEnd

```text
currently guaranteed watered boundary
```

Meaning:

```text
abhi tak garden kaha tak fully covered hai
```

---

## farthest

```text
maximum future coverage possible
```

Meaning:

```text
current intervals use karke
kitna aage ja sakte
```

---

# Why Greedy Works

Because:
```text
minimum taps chahiye
```

So:
```text
har step pe maximum expansion lena
```

best decision hai.

---

# Tap → Interval Conversion

For every tap:

```java
left = Math.max(0, i - ranges[i]);
right = Math.min(n, i + ranges[i]);
```

---

# Main Observation

If at any point:

```text
current position > farthest
```

then:
```text
garden cover karna impossible
```

because gap aa gaya.

---

# Pattern Recognition

This belongs to:

```text
Greedy Interval Coverage
```

NOT:
```text
Classic DP
```
