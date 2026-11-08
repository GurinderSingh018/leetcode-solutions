<div align="center">

# 1267. Count Servers that Communicate

![Difficulty](https://img.shields.io/badge/DIFFICULTY-Medium-ffa116?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/LANGUAGE-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Solutions](https://img.shields.io/badge/SOLUTIONS-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/DATE-2026--11--08-605d5d?style=for-the-badge&labelColor=1a1a2e)

[![View on LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/count-servers-that-communicate/)

</div>

---

<div align="center">

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="panel-dark.svg">
  <source media="(prefers-color-scheme: light)" srcset="panel-light.svg">
  <img alt="Topics: Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix, Counting — best runtime 2 ms (Beats 100%), best memory 54.8 MB (Beats 72%)" src="panel-dark.svg">
</picture>

</div>

> **New personal best** — Runtime improved on this submission.

### HOW IT WENT

| | |
|:--|:--|
| **Attempts** | 2 before accepted |
| **Time to solve** | 30 min |
| **Verdicts** | ❌ Wrong Answer → ✅ Accepted |

---

### NOTES

_No notes yet._

---

### SOLUTIONS (1)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-11-08 ← **latest** |

---

### PROBLEM DESCRIPTION

You are given a map of a server center, represented as a `m * n` integer matrix `grid`, where 1 means that on that cell there is a server and 0 means that it is no server. Two servers are said to communicate if they are on the same row or on the same column.**

Return the number of servers that communicate with any other server.

 

**Example 1:**

![](https://assets.leetcode.com/uploads/2019/11/14/untitled-diagram-6.jpg)

```

**Input:** grid = [[1,0],[0,1]]
**Output:** 0
Explanation:** No servers can communicate with others.
```

**Example 2:**

**![](https://assets.leetcode.com/uploads/2019/11/13/untitled-diagram-4.jpg)**

```

**Input:** grid = [[1,0],[1,1]]
**Output:** 3
**Explanation:** All three servers can communicate with at least one other server.

```

**Example 3:**

![](https://assets.leetcode.com/uploads/2019/11/14/untitled-diagram-1-3.jpg)

```

**Input:** grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
**Output:** 4
**Explanation:** The two servers in the first row can communicate with each other. The two servers in the third column can communicate with each other. The server at right bottom corner can't communicate with any other server.

```

 

**Constraints:**

	- `m == grid.length`

	- `n == grid[i].length`

	- `1 <= m <= 250`

	- `1 <= n <= 250`

	- `grid[i][j] == 0 or 1`

---

<div align="center">

<sub>Auto-synced by <strong>LeetSync</strong> · Built by <a href="https://deveshsamant.in/">Devesh Samant</a></sub>

</div>
