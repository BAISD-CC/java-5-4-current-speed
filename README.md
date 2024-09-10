Speedometers aren't really a thing in space. There are no wheels rolling on the ground to spin a wheel to tell you how fast you are going. Speed is calculated based on estimated movement. We need a way for astronauts to determine their current speed based on their rate of increase, how long they have to go until they are at the correct speed, and target speed. The formula to determine this is as follows:

`currentSpeed = (targetSpeed)/(1 + rateOfIncrease)^numberOfMinutes`

Write a method named calcCurrentSpeed that performs this calculation. The method should accept the target speed in kilometers, percent increase per minute, and number of minutes as arguments. It should return the current speed of the spacecraft in kilometers. Demonstrate the method in a program that lets our astronauts experiment with different values for the formula's terms.

Things you need to pass the tests:

> Input 1 - Enter target speed: 
> Input 2 - Rate of speed increase per minute: 
> Input 3 - Minutes until target speed achieved: 
> Formula - `current = target / (1 + rate)^minutes)`
> Output - Current speed: `[current]`(be sure to include 2 decimal places and commas)
