# Complexity Analysis

---

# Time Complexity

## O(n)

Why?

We iterate through garden only once.

Every tap contributes constant work.

---

# Space Complexity

## O(n)

Because of:

```text
jump[]
```

array used for interval compression.

---

# Why Better Than DP?

DP would explore multiple states.

Greedy directly chooses:

```text
maximum future expansion
```

which avoids unnecessary computation.
