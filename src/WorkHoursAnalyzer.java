public class WorkHoursAnalyzer {
    public static void main(String[] args) {
        int[][] workHours = {
                {8, 7, 6, 4, 3, 2, 4}, // Employee 0
                {6, 7, 8, 5, 6, 5, 2}, // Employee 1
                {5, 6, 7, 8, 9, 3, 6}, // Employee 2
                {7, 6, 4, 5, 6, 8, 5}  // Employee 3
        };

        // Calculate total hours worked by each employee
        int[] totalHoursPerEmployee = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            int totalHours = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours += workHours[i][j];
            }
            totalHoursPerEmployee[i] = totalHours;
        }

        // Find the maximum hours worked by any employee
        int maxHours = 0;
        for (int hours : totalHoursPerEmployee) {
            if (hours > maxHours) {
                maxHours = hours;
            }
        }

        // Display star employees
        System.out.println("Star employee(s) who work the most hours:");
        for (int i = 0; i < totalHoursPerEmployee.length; i++) {
            if (totalHoursPerEmployee[i] == maxHours) {
                System.out.println("Employee " + i);
            }
        }

        // Calculate total hours worked on each day
        int[] totalHoursPerDay = new int[workHours[0].length];
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[i].length; j++) {
                totalHoursPerDay[j] += workHours[i][j];
            }
        }

        // Find the maximum hours worked on any day
        int maxDayHours = 0;
        for (int hours : totalHoursPerDay) {
            if (hours > maxDayHours) {
                maxDayHours = hours;
            }
        }

        // Display busiest days
        System.out.println("Busiest day(s) that require the most total work hours:");
        for (int i = 0; i < totalHoursPerDay.length; i++) {
            if (totalHoursPerDay[i] == maxDayHours) {
                System.out.println("Day " + (i + 1));
            }
        }
    }
}



