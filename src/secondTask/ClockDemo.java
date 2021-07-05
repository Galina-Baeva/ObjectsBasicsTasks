package secondTask;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        String time = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount of seconds since midnight: ");
        seconds = scanner.nextInt();
        Clock firstClock = new Clock(seconds);
        for (int i = 0; i < 10; i ++) {
            firstClock.tick();
            firstClock.printTime();
        }
        System.out.println("Please enter the time (hours minutes seconds): ");
        hours = scanner.nextInt();
        minutes = scanner.nextInt();
        seconds = scanner.nextInt();

        //Scanner scanner2 = new Scanner(System.in);
        //time = scanner2.nextLine();
        //try {
        //    String[] timeParts = time.split("\\s");
        //    hours = Integer.parseInt(timeParts[0]);
         //   minutes = Integer.parseInt(timeParts[1]);
         //   seconds = Integer.parseInt(timeParts[2]);
       // } catch (NumberFormatException e) {
          //  System.out.println("Invalid input format");
        //}
        Clock secondClock = new Clock(hours, minutes, seconds);
        for (int i = 0; i < 10; i ++) {
            secondClock.tick();
            secondClock.printTime();
        }
        firstClock.addClock(secondClock);
        System.out.println();
        firstClock.printTime();
        secondClock.printTime();
        System.out.println();
        firstClock.subtractClock(secondClock);
        firstClock.printTime();
    }
}
