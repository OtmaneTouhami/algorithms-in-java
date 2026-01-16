# Algorithms in Java

Small learning project implementing classic algorithms in plain Java. Currently includes:

- Binary Search (`search.BinarySearch`)
- Sorting algorithms (`sort.Sort`): Bubble Sort, Selection Sort, and Insertion Sort

Last updated: 2026-01-16 18:29

## Project Structure

```
algorithms-in-java/
├─ pom.xml
├─ src/
│  └─ main/java/
│     ├─ Main.java
│     ├─ search/
│     │  └─ BinarySearch.java
│     └─ sort/
│        └─ Sort.java
└─ target/
```

## Requirements

- Java 21 (JDK 21+)
- Maven 3.9+

Verify your setup:

```
java -version
mvn -version
```

## Build

```
mvn clean compile
```

The compiled classes will be in `target/classes`.

## Run

There is a simple `Main` class that demonstrates binary search.

Option 1 — Run with Java directly (after compiling):

- macOS/Linux:
```
java -cp target/classes Main
```

- Windows (PowerShell or CMD):
```
java -cp target\classes Main
```

Option 2 — Run via Maven Exec Plugin (no POM changes required):

```
mvn -q exec:java -Dexec.mainClass=Main
```

Expected output (0-based index of the target in the demo array):

```
The target position is 7
```

## Usage Examples

### Binary Search

```
int[] arr = {1,2,3,4,5,6,7,8,9};
int target = 8;
int index = search.BinarySearch.search(arr, target); // -> 7
```

### Sorting

```
int[] data = {9, 7, 1, 6, 7, 8, 10, 1};

int[] bubble = sort.Sort.bubbleSort(data.clone());
int[] selection = sort.Sort.selectionSort(data.clone());
int[] insertion = sort.Sort.insertionSort(data.clone());
```

All indices are 0-based. Sorting methods mutate and return the provided array reference (typical for simple in-place demonstrations).

## Notes

- The algorithms are intentionally straightforward for learning purposes, favoring clarity over micro-optimizations.
- No unit tests are included yet; feel free to add tests under `src/test/java`.

## Contributing

Contributions are welcome! If you want to add more algorithms (searching, sorting, graph algorithms, etc.):

1. Create a branch.
2. Implement the algorithm under an appropriate package (e.g., `graph`, `dp`, `string`).
3. Include a short example or `Main` usage.
4. Open a pull request.
