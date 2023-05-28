/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * MonthlySalary class for computing the monthly salary
 */
package com.mycompany.main;

import java.util.Scanner;

public class MonthlySalary {

    @SuppressWarnings("resource")
    public static void computeSalary(double workHours, double HourlyR, double Allowances) {

       

        //Calculate the employee's Gross Monthly Salary
        double grossMonthlyPay = (workHours * HourlyR);
 
        
        
        
        // Calculate the deductions
        double sssDeduction = 0;
        double pagibigDeduction = 0;
        double philhealthDeduction = 0;

        if (grossMonthlyPay < 3250) {
            sssDeduction = 135;
        } else if (grossMonthlyPay < 3750) {
            sssDeduction = 157.50;
        } else if (grossMonthlyPay < 4250) {
            sssDeduction = 180;
        } else if (grossMonthlyPay < 4750) {
            sssDeduction = 202.50;
        } else if (grossMonthlyPay < 5250) {
            sssDeduction = 225;
        } else if (grossMonthlyPay < 5750) {
            sssDeduction = 247.50;
        } else if (grossMonthlyPay < 6250) {
            sssDeduction = 270;
        } else if (grossMonthlyPay < 6750) {
            sssDeduction = 292.50;
        } else if (grossMonthlyPay < 7250) {
            sssDeduction = 315;
        } else if (grossMonthlyPay < 7750) {
            sssDeduction = 337.50;
        } else if (grossMonthlyPay < 8250) {
            sssDeduction = 360;
        } else if (grossMonthlyPay < 8750) {
            sssDeduction = 382.50;
        } else if (grossMonthlyPay < 9250) {
            sssDeduction = 405;
        } else if (grossMonthlyPay < 9750) {
            sssDeduction = 427.50;
        } else if (grossMonthlyPay < 10250) {
            sssDeduction = 450;
        } else if (grossMonthlyPay < 10750) {
            sssDeduction = 472.50;
        } else if (grossMonthlyPay < 11250) {
            sssDeduction = 495;
        } else if (grossMonthlyPay < 11750) {
            sssDeduction = 517.50;
        } else if (grossMonthlyPay < 12250) {
            sssDeduction = 540;
        } else if (grossMonthlyPay < 12750) {
            sssDeduction = 562.50;
        } else if (grossMonthlyPay < 13250) {
            sssDeduction = 585;
        } else if (grossMonthlyPay < 13750) {
            sssDeduction = 607.50;
        } else if (grossMonthlyPay < 14250) {
            sssDeduction = 630;
        } else if (grossMonthlyPay < 14750) {
            sssDeduction = 652.50;
        } else if (grossMonthlyPay < 15250) {
            sssDeduction = 675;
        } else if (grossMonthlyPay < 15750) {
            sssDeduction = 697.50;
        } else if (grossMonthlyPay < 16250) {
            sssDeduction = 720;
        } else if (grossMonthlyPay < 16750) {
            sssDeduction = 742.50;
        } else if (grossMonthlyPay < 17250) {
            sssDeduction = 765;
        } else if (grossMonthlyPay < 17750) {
            sssDeduction = 787.50;
        } else if (grossMonthlyPay < 18250) {
            sssDeduction = 810;
        } else if (grossMonthlyPay < 18750) {
            sssDeduction = 832.50;
        } else if (grossMonthlyPay < 19250) {
            sssDeduction = 855;
        } else if (grossMonthlyPay < 19750) {
            sssDeduction = 877.50;
        } else if (grossMonthlyPay < 20250) {
            sssDeduction = 900;
        } else if (grossMonthlyPay < 20750) {
            sssDeduction = 922.50;
        } else if (grossMonthlyPay < 21250) {
            sssDeduction = 945;
        } else if (grossMonthlyPay < 22750) {
            sssDeduction = 1012.50;
        } else if (grossMonthlyPay < 23250) {
            sssDeduction = 1035;
        } else if (grossMonthlyPay < 23750) {
            sssDeduction = 1057.50;
        } else if (grossMonthlyPay < 24250) {
            sssDeduction = 1080;
        } else if (grossMonthlyPay < 24750) {
            sssDeduction = 1102.50;
        } else if (grossMonthlyPay > 24750) {
            sssDeduction = 1125;
        }

        if (grossMonthlyPay > 1500) {
            pagibigDeduction = (grossMonthlyPay * 0.02);
        } else {
            pagibigDeduction = 0;
        }

        if (pagibigDeduction > 100) {
            pagibigDeduction = 100;
        }

        if (grossMonthlyPay <= 59999.99) {
            philhealthDeduction = (float) (grossMonthlyPay * 0.03) / 2;
        } else {
            pagibigDeduction = 0;
        }

        if (pagibigDeduction > 60000) {
            pagibigDeduction = 900;
        }

        double withholdingTax = 0;

        if (grossMonthlyPay <= 20832) {
            // No withholding tax
            withholdingTax = 0.0;
        } else if (grossMonthlyPay < 33333) {
            // 20% in excess of 20833
            double excess = grossMonthlyPay - 20833;
            withholdingTax = excess * 0.20;
        } else if (grossMonthlyPay < 66667) {
            // 2500 plus 25% in excess of 33333
            double excess = grossMonthlyPay - 33333;
            withholdingTax = 2500 + excess * 0.25;
        } else if (grossMonthlyPay < 166667) {
            // 10833 plus 30% in excess of 66667
            double excess = grossMonthlyPay - 66667;
            withholdingTax = 10833 + excess * 0.30;
        } else if (grossMonthlyPay < 666667) {
            // 40833.33 plus 32% in excess of 166667
            double excess = grossMonthlyPay - 166667;
            withholdingTax = 40833.33 + excess * 0.32;
        } else {
            // 200833.33 plus 35% in excess of 666667
            double excess = grossMonthlyPay - 666667;
            withholdingTax = 200833.33 + excess * 0.35;
        }

        double totalDeductions =  (sssDeduction + pagibigDeduction + philhealthDeduction);

  

        double totalTaxable = grossMonthlyPay - totalDeductions;
        double grossincome = totalTaxable - withholdingTax;
        double netMonthlySalary = (grossincome + Allowances);
        
        
        // Set the company title and sub-heading
        String companyTitle = "MOTOR PH";
        String subheading = "PAYROLL SUMMARY";
        
        System.out.println();
        System.out.println("** " + companyTitle + " **");
        System.out.println(subheading);
        
        System.out.printf("Hourly Rate: %.2f\n", HourlyR);
        System.out.printf("Hours Worked: %.2f\n", workHours);
        System.out.printf("Gross Monthly Pay: %.2f\n", grossMonthlyPay);
        System.out.println();
        System.out.println("Deductions:");
        System.out.printf("SSS deduction: %.2f\n", sssDeduction);
        System.out.printf("PhilHealth deduction: %.2f\n", philhealthDeduction);
        System.out.printf("Pag-Ibig deduction: %.2f\n", pagibigDeduction);
        System.out.printf("Total Deductions: %.2f\n", totalDeductions);
        System.out.println();
        System.out.printf("Total Taxable Income: %.2f\n", totalTaxable);
        System.out.printf("Less: Withholding Tax: %.2f\n", withholdingTax);
        System.out.printf("Gross Income: %.2f\n", grossincome);
        System.out.printf("Add: Allowances: %.2f\n", Allowances);
        System.out.println();
        System.out.printf("Net Monthly Salary: %.2f\n", netMonthlySalary);
        System.out.println();
        System.out.println();
        System.out.println("Prepared By: Clark Anton Juan V. Diaz");
    }
}

