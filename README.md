Speedometers aren't really a thing in space. There are no wheels rolling on the ground to spin a wheel to tell you how fast you are going. Speed is calculated based on estimated movement. We need a way for astronauts to determine their current speed based on their rate of increase, how long they have to go until they are at the correct speed, and target speed. The formula to determine this is as follows:

`currentSpeed = (targetSpeed)/(1 + rateOfIncrease)^numberOfMinutes`

Write a static method named `currentSpeed` that performs this calculation. The method should accept the target speed (`double`), the rate of increase as a decimal (`double`), and the number of minutes (`double`) as arguments, in that order, and return the current speed as a `double`. Use `Math.pow` to raise `(1 + rate)` to the `minutes` power.

Demonstrate the method in a `main` method that lets an astronaut enter the target speed, the rate of increase, and the number of minutes, then prints the resulting current speed.

## What You're Building

A program that:

1. Uses `Scanner` to read three values from the astronaut: target speed, rate of increase per minute, and number of minutes.
2. Converts the entered rate of increase from a whole-number percent (e.g. `5` for 5%) into decimal notation (e.g. `0.05`) before using it in the formula.
3. Calls the `currentSpeed` method, passing the target speed, the decimal rate, and the number of minutes.
4. Displays the result formatted with commas and exactly two decimal places.

## Required Prompts and Output

Your program must use these exact prompts and output label:

```
Enter target speed: 
Rate of speed increase per minute: 
Minutes until target speed achieved: 
Current speed: [current]
```

Where `[current]` is the calculated current speed, formatted with a comma thousands separator and exactly two decimal places (for example, `16,575.66`).

## Example Run

```
Enter target speed: 27000
Rate of speed increase per minute: 5
Minutes until target speed achieved: 10
Current speed: 16,575.66
```

## Java Concepts Used

- Variables and `Scanner` input
- A static method with parameters and a return value
- `Math.pow` for exponentiation
- Formatted output (comma separators, two decimal places)
