package com.mycompany.main;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, CsvValidationException {
        String employeeNo;
        Scanner strScanner = new Scanner(System.in);
        System.out.print("Enter Employee No.: ");
        employeeNo = strScanner.nextLine();
        
        Employee _employee = new Employee();
        _employee.DisplayEmployeeDetails(employeeNo);
        System.out.println("Last Name.: " + _employee.GetlastName());
        System.out.println("First Name: " + _employee.GetfirstName());
        System.out.println("Birthday  : " + _employee.GetBirthday());
        System.out.println("Phone No. : " + _employee.GetphoneNumber());
        System.out.println("SSS #     : " + _employee.GetSSS());
        System.out.println("Philhealth: " + _employee.GetPhilhealth());
        System.out.println("TIN:      : " + _employee.GetTIN());
        System.out.println("Pag-Ibig #: " + _employee.GetPagibig());
        System.out.println("Status    : " + _employee.GetStatus());
        System.out.println("Position  : " + _employee.GetPosition());
        System.out.println("Immediate Supervisor: " + _employee.GetImmediateSupervisor());
        System.out.println("Basic Salary        : " + _employee.GetBasicSalary());
        System.out.println("Rice Subsidy        : " + _employee.GetRiceSubsidy());
        System.out.println("Phone Allowance     : " + _employee.GetPhoneAllowance());
        System.out.println("Clothing Allowance  : " + _employee.GetClothingAllowance());
        System.out.println("Gross Semi-Monthly Rate: " + _employee.GetGrossSemiSalary());
        System.out.println("Hourly Rate         : " + _employee.GetHourlyRate());
        System.out.println();
        System.out.println("COMPUTE WORK HOURS");
        
    
    double Attendance = AttendanceCalculator.computeMonthlyAttendance();
    double Allowances = Double.parseDouble(_employee.GetRiceSubsidy().replace(",", ""))+ Double.parseDouble(_employee.GetPhoneAllowance().replace(",", "")) + Double.parseDouble(_employee.GetClothingAllowance().replace("," , ""));
    double HourlyRate = Double.parseDouble(_employee.GetHourlyRate());
       
    System.out.println();
        System.out.println("COMPUTE MONTHLY SALARY");
        System.out.println();
        
        
    MonthlySalary.computeSalary(Attendance, HourlyRate, Allowances);
    }
}



