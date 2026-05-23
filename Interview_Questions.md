# Interview Questions

---

# Q1. What is the actual transformation of this problem?

Every tap becomes an interval.

Problem becomes:

```text
minimum intervals needed
to cover [0,n]
```

---

# Q2. Why is this Greedy and not DP?

Because at every step:

```text
locally best farthest expansion
```

guarantees optimal answer.

No need to explore all possibilities.

---

# Q3. What does currEnd represent?

```text
current guaranteed watered boundary
```

Meaning:
```text
garden currently kaha tak fully covered hai
```

---

# Q4. What does farthest represent?

```text
maximum future coverage possible
```

using current reachable intervals.

---

# Q5. Why do we need both currEnd and farthest?

## currEnd

Current tap-set ki limit.

## farthest

Next tap-set se maximum expansion.

Exactly same idea as:
```text
Jump Game II
```

---

# Q6. When do we increase tap count?

When:

```text
i == currEnd
```

Meaning:
```text
current coverage khatam
```

Now:
```text
new tap lena compulsory
```

---

# Q7. When do we return -1?

If:

```text
i > farthest
```

Meaning:
```text
current position reachable hi nahi
```

Gap aa gaya in coverage.

---

# Q8. Why overlap is allowed?

Question only requires:

```text
continuous full coverage
```

Overlap is completely valid.

Only gaps are problematic.
