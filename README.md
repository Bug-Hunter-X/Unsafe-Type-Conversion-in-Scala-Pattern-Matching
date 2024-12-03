# Unsafe Type Conversion in Scala Pattern Matching

This repository demonstrates a potential problem in Scala when combining pattern matching with `asInstanceOf` for type conversions. The provided code appears to work for specific types (Int and String) but is not robust against other types, risking runtime exceptions. This highlights the importance of type-safe techniques in Scala, such as generics and sealed traits.

The `bug.scala` file contains the buggy code. `bugSolution.scala` offers an improved solution.