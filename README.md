# Ch. 5 Challenge 4: Current Speed

## Mission Briefing

Speedometers don't really work in space: there are no wheels rolling on the ground to measure. Astronauts estimate their speed from how they're moving instead. Your program asks for the target speed, the rate of speed increase per minute, and the minutes left until the target speed is reached, then calculates the current speed. The math lives in its own method, `currentSpeed`, which `main` calls.

## What You'll Practice

- A value-returning method with three parameters (Day 2 notes, R2; Day 1 notes, P2)
- Keeping the calculation in its own method, apart from input and output (Day 3 notes, FD1)
- `Math.pow` for exponents, and `printf` for formatted output (earlier chapters)

## Starter Code

Edit `src/CurrentSpeed.java`. The class is `CurrentSpeed`. Do not rename the file or the class.

The comment above `main` describes the `currentSpeed` method to write. The comments in `main` list its steps in order.

## Inputs

| Order | What it is | Java type |
|---|---|---|
| 1 | The target speed | `double` |
| 2 | The rate of speed increase per minute, as a whole-number percent (for example, `5` for 5%) | `double` |
| 3 | The number of minutes until the target speed is reached | `double` |

## Rules

### 1. The formula

```
currentSpeed = targetSpeed / (1 + rate)^minutes
```

`rate` is a decimal in the formula, so 5% is `0.05`.

### 2. Convert the percent first

The user types the rate as a whole-number percent. Divide it by 100 in `main`, before you pass it to the method: `5` becomes `0.05`.

### 3. The method

`currentSpeed` is `static`, accepts the target speed, the decimal rate, and the minutes as `double` arguments **in that order**, and returns the current speed as a `double`. It does no input or output.

### 4. The result

Print the current speed with a comma between thousands and exactly 2 decimal places, for example `16,575.66`.

## What to Use

These are suggestions. Any approach that produces the correct output earns full credit, as long as it passes the three source checks (see How It's Checked).

- The header: `public static double currentSpeed(double target, double rate, double minutes)`.
- The body: `return target / Math.pow(1 + rate, minutes);`. `Math.pow(a, b)` raises `a` to the `b` power.
- In `main`: `double current = currentSpeed(target, rate, minutes);`, then `System.out.printf("Current speed: %,.2f%n", current);`. The `,` in `%,.2f` adds the thousands separator.

## Exact Output

Spelling, capitalization, and punctuation must match. The user types each value on the same line as its prompt.

The three prompts, in order:

```
Enter target speed: 
Rate of speed increase per minute: 
Minutes until target speed achieved: 
```

The result:

```
Current speed: [current]
```

`[current]` has a comma thousands separator and exactly 2 decimal places.

## Sample Runs

```text
Enter target speed: 27000
Rate of speed increase per minute: 5
Minutes until target speed achieved: 10
Current speed: 16,575.66
```

```text
Enter target speed: 10000
Rate of speed increase per minute: 10
Minutes until target speed achieved: 5
Current speed: 6,209.21
```

## Test Your Program

Run each test before you submit. The autograder uses these and other values.

| Target speed | Rate (%) | Minutes | Result line |
|---|---|---|---|
| `27000` | `5` | `10` | `Current speed: 16,575.66` |
| `10000` | `10` | `5` | `Current speed: 6,209.21` |
| `50000` | `5` | `3` | `Current speed: 43,191.88` |
| `5000` | `0` | `20` | `Current speed: 5,000.00` |
| `1200000` | `2.5` | `30` | `Current speed: 572,091.22` |

A rate of 0% means the speed never changes, so the current speed equals the target speed.

## How It's Checked

| Check | What it looks for | Points |
|---|---|---|
| 27000, 5%, 10 minutes | `Current speed: 16,575.66` | 5 |
| 10000, 10%, 5 minutes | `Current speed: 6,209.21` | 5 |
| 50000, 5%, 3 minutes | `Current speed: 43,191.88` | 5 |
| 5000, 0%, 20 minutes | `Current speed: 5,000.00` | 4 |
| Uses a `Scanner` | The source code creates a `Scanner` with `System.in` | 2 |
| `currentSpeed` method | The source code declares `static double currentSpeed(` | 2 |
| Uses `Math.pow` | The source code calls `Math.pow` | 2 |
| **Total** | | **25** |

Any approach that produces the correct output earns full credit, as long as it passes the three source checks. Results must come from the user's input; the tests use values you have not seen.

## Where to Look

- Day 2 notes, R2 (Using a return value): a method that returns a value, and storing that value in `main`.
- Day 1 notes, P2 (Two parameters): arguments are matched to parameters by position, so the order matters.
- Day 3 notes, FD1 (One task per method): the calculation stays separate from input and output.
- Rule 2 above: convert the percent before calling the method.
