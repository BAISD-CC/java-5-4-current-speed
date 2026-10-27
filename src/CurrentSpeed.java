// INFO: Ch. 5 Project: Current Speed
// INFO: Only the class is written for you. You write the imports, main,
//       and eight methods.
// INFO: Work one TODO at a time, in order. Most TODOs have two parts: the
//       (call) inside main, and the (method) below main.
// INFO: Test as you go. After you write a method and its call, add a
//       temporary println in main to show the value it sent back, run the
//       program, then remove the println.
// INFO: The log files (flight_alpha.txt and the others) are in the project
//       folder, next to README.md. Each line is one speed reading in km/h,
//       taken once a minute. The last line is the most recent reading.
// INFO: A method that opens a file needs throws IOException in its
//       header, and so does every method that calls it. A method that
//       doesn't open a file doesn't get the clause.

// TODO 1: Import Scanner from java.util, and File and IOException from
//         java.io.

public class CurrentSpeed {

    // TODO 2 (main): Write main here. Its first statement creates a Scanner
    //                for the keyboard. Then do the (call) steps below, in
    //                order, inside main. main calls methods that open a
    //                file, so think about what its header needs.

        // TODO 3 (call): Call getFileName, passing the keyboard Scanner.
        //                Store the file name it sends back.

        // TODO 4 (call): As long as fileExists says the file isn't there,
        //                print File not found: [file name]
        //                then call getFileName again and store the new name.

        // TODO 5 (call): Call countReadings. Store the count.

        // TODO 6 (call): Call getTotalSpeed. Store the total.

        // TODO 7 (call): Call getCurrentSpeed. Store the current speed.

        // TODO 8 (call): Call calcAverage, passing the total and the count.
        //                Store the average.

        // TODO 10 (call): Call displayReport, passing the file name, the
        //                 count, the average, and the current speed, in
        //                 that order. Then close the keyboard Scanner.


    // TODO 3 (method): Write the getFileName method.
    //   Receives:     the keyboard Scanner
    //   Does:         prints "Enter the log file name: " with print, then
    //                 reads the whole line the user types
    //   Sends back:   the file name, as a String
    //   Opens a file? No


    // TODO 4 (method): Write the fileExists method.
    //   Receives:     the file name, as a String
    //   Does:         makes a File object for the name and asks it whether
    //                 the file is there, with its exists() method
    //   Sends back:   true if the file exists, false if it doesn't
    //   Opens a file? No. exists() only checks; it doesn't open the file.


    // TODO 5 (method): Write the countReadings method.
    //   Receives:     the file name, as a String
    //   Does:         opens the file and counts the readings in it, then
    //                 closes the file
    //   Sends back:   the number of readings, as an int
    //   Opens a file? Yes
    //   INFO:         Read each number with nextDouble() even though you
    //                 only count it. If you don't read it, hasNext() stays
    //                 true and the loop never ends.


    // TODO 6 (method): Write the getTotalSpeed method.
    //   Receives:     the file name, as a String
    //   Does:         opens the file and adds up all of its readings, then
    //                 closes the file
    //   Sends back:   the total, as a double
    //   Opens a file? Yes


    // TODO 7 (method): Write the getCurrentSpeed method.
    //   Receives:     the file name, as a String
    //   Does:         opens the file and reads every reading, keeping only
    //                 the last one, then closes the file
    //   Sends back:   the last reading in the file, as a double
    //   Opens a file? Yes


    // TODO 8 (method): Write the calcAverage method.
    //   Receives:     the total, as a double, and the count, as an int,
    //                 in that order
    //   Does:         divides the total by the count
    //   Sends back:   the average, as a double
    //   Opens a file? No


    // TODO 9 (method): Write the getStatus method.
    //   Receives:     a speed in km/h, as a double
    //   Does:         picks the status for that speed:
    //                   40,000 or more:              Escape velocity
    //                   28,000 or more, under 40,000: Orbital
    //                   under 28,000:                Suborbital
    //   Sends back:   the status, as a String
    //   Opens a file? No
    //   INFO:         main doesn't call getStatus. displayReport does.


    // TODO 10 (method): Write the displayReport method.
    //   Receives:     the file name (String), the count (int), the average
    //                 (double), and the current speed (double), in that order
    //   Does:         prints the report shown in the README. For the Status
    //                 line, it calls getStatus with the current speed.
    //   Sends back:   nothing
    //   Opens a file? No

}
