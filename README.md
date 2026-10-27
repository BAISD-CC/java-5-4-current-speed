# Ch. 5 Project: Current Speed

## Mission Briefing

Speedometers don't really work in space: there are no wheels rolling on the ground to measure. Instead, the ship's navigation computer records its speed once a minute in a log file. Mission Control needs a program that reads any log file and reports how many readings it has, the average speed, the current speed, and the ship's status. This time you write the whole program, using everything from this chapter.

## What You'll Practice

- Void and value-returning methods that send back a `String`, a `boolean`, an `int`, and a `double` (Days 1 and 2)
- Input, calculation, and output methods (Day 3 notes, FD1)
- Reading a file inside a method, and passing `throws IOException` up to `main` (Day 3 notes, TH1)
- A `boolean` method as a loop condition (Day 2 notes, B1)
- A method that calls a method (Day 1 notes, M3)
- Checking whether a file exists with `File`'s `exists()` method (Chapter 4)

## How This Project Works

Edit `src/CurrentSpeed.java`. The class is `CurrentSpeed`. Do not rename the file or the class.

Only the class is written for you. You write the imports, `main`, and eight methods. The comments in the code are tagged:

| Tag | Meaning |
|---|---|
| `INFO:` | Background information. Nothing to do. |
| `TODO n:` | Your work. Most TODOs have two parts: the `(call)` inside `main`, and the `(method)` below `main`. |

Work one TODO at a time, in order:

1. TODO 1 and TODO 2 set up the file: the imports, and `main` with its keyboard `Scanner`.
2. For TODOs 3 through 10, write the method at `TODO n (method)`, then write its call at `TODO n (call)`.
3. Test as you go. The report isn't printed until TODO 10, so after each method, add a temporary `println` in `main` to show what it sent back, like `System.out.println("Count: " + count);`. Run the program, check the value, then remove the `println`.

TODO 9 has no call in `main`. `displayReport` calls `getStatus`, so you'll see it working when you finish TODO 10.

IntelliJ lists every TODO in its TODO window (**View > Tool Windows > TODO**).

## The throws Rule

A method that opens a file needs `throws IOException` at the end of its header. Every method that calls one of those needs the clause too, all the way up to `main`. A method that doesn't open a file doesn't get the clause. Each TODO in the code says whether its method opens a file.

## The Log Files

The log files are in the project folder, next to this README, so you type just the file name when the program asks. Each line is one speed reading in km/h, taken once a minute. The last line is the most recent reading.

| File | Readings | Used for |
|---|---|---|
| `flight_alpha.txt` | 6 | Sample runs and tests |
| `flight_bravo.txt` | 5 | Tests |
| `flight_delta.txt` | 4 | Tests |
| `flight_charlie.txt` | 7 | A hidden test. You can run it, but its results aren't listed here. |

## Your TODOs

### TODO 1: Imports

Import `Scanner` from `java.util`, and `File` and `IOException` from `java.io`. Imports go at the very top of the file, above the class.

<details>
<summary>Hint for TODO 1</summary>

Each import is its own line ending in a semicolon, like `import java.util.Scanner;`. You've used this one since Chapter 2. The other two come from the `java.io` package instead.

</details>

### TODO 2: main

Write `main`. Its first statement creates a `Scanner` for the keyboard. The `(call)` TODOs are the rest of `main`'s steps, in order, so write `main` around them. `main` calls methods that open a file, so check The throws Rule above.

<details>
<summary>Hint for TODO 2</summary>

Look at `main` in Day 3 notes, TH1. It calls `getTotalFuel`, which opens a file, so `main`'s header ends with `throws IOException`. The rest of the header is the same `main` header you've written all year.

</details>

### TODO 3: getFileName

- **Receives:** the keyboard `Scanner`
- **Does:** prints `Enter the log file name: ` with `print`, then reads the whole line the user types
- **Sends back:** the file name, as a `String`
- **Opens a file?** No
- **Call:** store the file name it sends back

<details>
<summary>Hint for TODO 3</summary>

This is the same method as `getFileName` in Day 3 notes, TH1, with a different prompt. Use `nextLine()` to read the whole line.

</details>

### TODO 4: fileExists

- **Receives:** the file name, as a `String`
- **Does:** makes a `File` object for the name and asks it whether the file is there, with its `exists()` method
- **Sends back:** `true` if the file exists, `false` if it doesn't
- **Opens a file?** No. `exists()` only checks; it doesn't open the file.
- **Call:** as long as `fileExists` says the file isn't there, print `File not found: [file name]`, then call `getFileName` again and store the new name

<details>
<summary>Hint for TODO 4</summary>

`File file = new File(fileName);` makes the `File` object, and `file.exists()` is `true` or `false`, so the method can return it directly. In `main`, a `boolean` method can be a loop condition, just like `isSafeAltitude` is an `if` condition in Day 2 notes, B1. Keep looping while the file does **not** exist: `!` flips `true` and `false`.

</details>

### TODO 5: countReadings

- **Receives:** the file name, as a `String`
- **Does:** opens the file and counts the readings in it, then closes the file
- **Sends back:** the number of readings, as an `int`
- **Opens a file?** Yes
- **Call:** store the count

<details>
<summary>Hint for TODO 5</summary>

Start from `getTotalFuel` in Day 3 notes, TH1: it opens the file with `new Scanner(file)` and loops `while (inputFile.hasNext())`. Instead of adding each number, add 1 to a count. You still have to read each number with `nextDouble()`. If you don't, `hasNext()` stays `true` and the loop never ends.

</details>

### TODO 6: getTotalSpeed

- **Receives:** the file name, as a `String`
- **Does:** opens the file and adds up all of its readings, then closes the file
- **Sends back:** the total, as a `double`
- **Opens a file?** Yes
- **Call:** store the total

<details>
<summary>Hint for TODO 6</summary>

This is the same pattern as `getTotalFuel` in Day 3 notes, TH1: start a total at 0, and add each reading to it inside the loop.

</details>

### TODO 7: getCurrentSpeed

- **Receives:** the file name, as a `String`
- **Does:** opens the file and reads every reading, keeping only the last one, then closes the file
- **Sends back:** the last reading in the file, as a `double`
- **Opens a file?** Yes
- **Call:** store the current speed

<details>
<summary>Hint for TODO 7</summary>

Use the same loop as `getTotalSpeed`, but store each reading in a variable instead of adding it. Each reading replaces the one before it, so when the loop ends, the variable holds the last reading.

</details>

### TODO 8: calcAverage

- **Receives:** the total, as a `double`, and the count, as an `int`, in that order
- **Does:** divides the total by the count
- **Sends back:** the average, as a `double`
- **Opens a file?** No
- **Call:** pass the total and the count, and store the average

<details>
<summary>Hint for TODO 8</summary>

Look at `gallonsToLiters` in Day 3 notes, FD1: a calculation method takes values and returns the result, with no printing. A `double` divided by an `int` gives a `double`, so no cast is needed.

</details>

### TODO 9: getStatus

- **Receives:** a speed in km/h, as a `double`
- **Does:** picks the status for that speed:

  | Speed | Status |
  |---|---|
  | 40,000 or more | `Escape velocity` |
  | 28,000 or more, under 40,000 | `Orbital` |
  | Under 28,000 | `Suborbital` |

- **Sends back:** the status, as a `String`
- **Opens a file?** No
- **Call:** none in `main`. `displayReport` calls it in TODO 10.

<details>
<summary>Hint for TODO 9</summary>

Use an `if`/`else if` chain that checks the highest range first, and return the status the same way `fullName` returns a `String` in Day 2 notes, S1. These ranges include their starting number, so the checks use `>=`: exactly 28,000 is `Orbital`, and exactly 40,000 is `Escape velocity`.

</details>

### TODO 10: displayReport

- **Receives:** the file name (`String`), the count (`int`), the average (`double`), and the current speed (`double`), in that order
- **Does:** prints the report shown in Exact Output. For the `Status` line, it calls `getStatus` with the current speed.
- **Sends back:** nothing
- **Opens a file?** No
- **Call:** pass the file name, the count, the average, and the current speed, in that order. Then close the keyboard `Scanner`.

<details>
<summary>Hint for TODO 10</summary>

Look at `displayResults` in Day 3 notes, FD1: an output method is `void` and takes the values it displays. Calling `getStatus` from inside `displayReport` is a method calling a method, like `checkEngines` calling `checkFuel` in Day 1 notes, M3. For the two speed lines, use `printf` with `%,.2f`: the comma adds the thousands separator, and `.2` gives two decimal places.

</details>

## Exact Output

Spelling, capitalization, and punctuation must match. Extra spaces don't count against you, but missing spaces do.

The prompt, printed by `getFileName`:

```
Enter the log file name: 
```

The message when the file isn't there, printed by `main`:

```
File not found: [file name]
```

The report, printed by `displayReport`:

```
=== Flight Log Report ===
Log file: [file name]
Readings: [count]
Average speed: [average] km/h
Current speed: [current speed] km/h
Status: [status]
```

Both speeds have a comma between thousands and exactly 2 decimal places, for example `15,000.00`.

## Sample Runs

```text
Enter the log file name: flight_alpha.txt
=== Flight Log Report ===
Log file: flight_alpha.txt
Readings: 6
Average speed: 15,000.00 km/h
Current speed: 28,000.00 km/h
Status: Orbital
```

A file name that doesn't exist:

```text
Enter the log file name: flight_zulu.txt
File not found: flight_zulu.txt
Enter the log file name: flight_bravo.txt
=== Flight Log Report ===
Log file: flight_bravo.txt
Readings: 5
Average speed: 6,690.10 km/h
Current speed: 14,250.50 km/h
Status: Suborbital
```

## Test Your Program

Run each test before you submit. The autograder uses these files and `flight_charlie.txt`.

| File | Readings | Average speed | Current speed | Status |
|---|---|---|---|---|
| `flight_alpha.txt` | 6 | `15,000.00 km/h` | `28,000.00 km/h` | `Orbital` |
| `flight_bravo.txt` | 5 | `6,690.10 km/h` | `14,250.50 km/h` | `Suborbital` |
| `flight_delta.txt` | 4 | `35,312.56 km/h` | `40,000.00 km/h` | `Escape velocity` |

Also type a name that doesn't exist, like `flight_zulu.txt`. The program should print `File not found: flight_zulu.txt` and ask again.

## How It's Checked

| Check | What it looks for | Points |
|---|---|---|
| TODO 1: Imports | `Scanner`, `File`, and `IOException` imported | 1 |
| TODO 2: main has throws IOException | `throws IOException` on `main`'s header | 2 |
| TODO 3: getFileName header | One `Scanner` parameter, returns a `String`, no `throws` | 1 |
| TODO 3: File name prompt | `Enter the log file name:` | 1 |
| TODO 4: fileExists header | One `String` parameter, returns a `boolean`, no `throws` | 1 |
| TODO 4: A file that isn't there | `File not found: flight_zulu.txt`, then the prompt again | 2 |
| TODO 5: countReadings header | One `String` parameter, returns an `int`, `throws IOException` | 1 |
| TODO 5: Readings in flight_alpha.txt | `Readings: 6` | 1 |
| TODO 5: Readings in a hidden file | The count for `flight_charlie.txt` | 1 |
| TODO 6: getTotalSpeed header | One `String` parameter, returns a `double`, `throws IOException` | 1 |
| TODO 7: getCurrentSpeed header | One `String` parameter, returns a `double`, `throws IOException` | 1 |
| TODO 7: Current speed in flight_alpha.txt | `Current speed: 28,000.00 km/h` | 1 |
| TODO 7: Current speed in a hidden file | The current speed for `flight_charlie.txt` | 1 |
| TODO 8: calcAverage header | A `double` then an `int` parameter, returns a `double`, no `throws` | 1 |
| TODO 8: Average speed in flight_alpha.txt (needs TODOs 5 and 6) | `Average speed: 15,000.00 km/h` | 1 |
| TODO 8: Average speed in a hidden file (needs TODOs 5 and 6) | The average for `flight_charlie.txt` | 1 |
| TODO 9: getStatus header | One `double` parameter, returns a `String`, no `throws` | 1 |
| TODO 9: Suborbital (flight_bravo.txt) | `Status: Suborbital` | 1 |
| TODO 9: Exactly 28,000 is Orbital (flight_alpha.txt) | `Status: Orbital` | 1 |
| TODO 9: Exactly 40,000 is Escape velocity (flight_delta.txt) | `Status: Escape velocity` | 1 |
| TODO 10: displayReport header | `String`, `int`, `double`, `double` parameters, `void`, no `throws` | 1 |
| TODO 10: displayReport calls getStatus | A call to `getStatus` inside `displayReport` | 1 |
| TODO 10: Report heading and file name | `=== Flight Log Report ===` and `Log file: flight_bravo.txt` | 1 |
| **Total** | | **25** |

- Header checks score even if your program doesn't compile. Output checks need it to compile and run.
- If your program gets stuck in a loop, every output check fails, so test as you go.
- Hidden tests run when you submit, not in the Iteryx window.

## Where to Look

- Day 3 notes, TH1 (A method that reads a file): `getFileName`, a method that reads a file, and `throws IOException` on `main`.
- Day 3 notes, FD1 (One task per method): input, calculation, and output methods.
- Day 2 notes, B1 (A boolean return as a condition) and S1 (Returning a String).
- Day 1 notes, M3 (A method that calls a method).
- The throws Rule, above.
