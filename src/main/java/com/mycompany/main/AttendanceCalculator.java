package com.mycompany.main;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class AttendanceCalculator {

    public static void main(String[] args) {
        try {
            computeMonthlyAttendance();
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

    public static double computeMonthlyAttendance() throws FileNotFoundException, IOException, CsvValidationException {
        String filename = "Attendance.csv";
        CSVReader reader = new CSVReader(new FileReader(filename));
        String[] header = reader.readNext();

        // Find the indices of the required columns
        int employeeNoIndex = findColumnIndex(header, "employee #");
        int dateIndex = findColumnIndex(header, "date");
        int timeInIndex = findColumnIndex(header, "time-in");
        int timeOutIndex = findColumnIndex(header, "time-out");

        if (employeeNoIndex == -1 || dateIndex == -1 || timeInIndex == -1 || timeOutIndex == -1) {
            System.out.println("Required columns not found in the CSV file.");
            return 0.0;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Re-Enter the employee number to view the number of hours worked in specific pay Month: ");
        String employeeNo = scanner.nextLine();

        System.out.print("Enter the pay month (MM): ");
        String monthString = scanner.nextLine();
        int monthNumber = Integer.parseInt(monthString);

        Map<String, Double> workedDates = new HashMap<>();
        double totalWorkHours = 0.0;
        String[] record;
        while ((record = reader.readNext()) != null) {
            String recordEmployeeNo = record[employeeNoIndex];
            if (recordEmployeeNo.equals(employeeNo)) {
                String dateString = record[dateIndex];
                LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                if (date.getMonthValue() == monthNumber) {
                    String timeIn = record[timeInIndex];
                    String timeOut = record[timeOutIndex];
                    double workHours = computeWorkHours(timeIn, timeOut);
                    workedDates.put(dateString, workHours);
                    totalWorkHours += workHours;
                }
            }
        }

        reader.close();

        System.out.println("Worked hours for Employee #" + employeeNo + " in Month " + monthString + ":");
        List<Map.Entry<String, Double>> sortedDates = new ArrayList<>(workedDates.entrySet());
        sortedDates.sort(Comparator.comparing(Map.Entry::getKey));

        int columnCount = 0;
        for (Map.Entry<String, Double> entry : sortedDates) {
            String date = entry.getKey();
            double workHours = entry.getValue();
            System.out.printf("%-12s:%-6s hours   ", date, workHours);
            columnCount++;

            if (columnCount == 3) {
                System.out.println();
                columnCount = 0;
            }
        }

        if (columnCount != 0) {
            System.out.println();
        }

        System.out.println("Total work hours for Employee #" + employeeNo + " in Month " + monthString + ": " + totalWorkHours + " hours");
        return totalWorkHours;
    }

    private static int findColumnIndex(String[] header, String columnName) {
        for (int i = 0; i < header.length; i++) {
            if (header[i].equalsIgnoreCase(columnName)) {
                return i;
            }
        }
        return -1;
    }

    private static double computeWorkHours(String timeIn, String timeOut) {
        // Implement the logic to compute work hours based on timeIn and timeOut
        return 8.0;
    }
}
