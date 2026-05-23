# Dry Run

Input:

```text
n = 5
ranges = [3,4,1,1,0,0]
```

---

# STEP 1

Convert taps into intervals.

---

## Tap 0

```text
[0,3]
```

---

## Tap 1

```text
[0,5]
```

---

## Tap 2

```text
[1,3]
```

---

## Tap 3

```text
[2,4]
```

---

## Tap 4

```text
[4,4]
```

---

## Tap 5

```text
[5,5]
```

---

# Main Goal

Need to cover:

```text
0 → 5
```

---

# Initial State

```text
currEnd = 0
farthest = 0
taps = 0
```

---

# i = 0

Possible intervals:

```text
[0,3]
[0,5]
```

Best future reach:

```text
farthest = 5
```

Now:

```text
i == currEnd
```

So:
```text
new tap lena padega
```

Update:

```text
taps = 1
currEnd = 5
```

Meaning:

```text
0 → 5
```

already fully covered.

---

# DONE

Answer:

```text
1
```
