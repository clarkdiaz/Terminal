package com.mycompany.main;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import com.opencsv.exceptions.CsvValidationException;
        


public class Employee {
    private String _employeeNo;
    private String _lastName;
    private String _firstName;
    private String _Birthday;
    private String _Address;
    private String _phoneNumber;
    private String _SSS;
    private String _Philhealth;
    private String _TIN;
    private String _Pagibig;
    private String _Status;
    private String _Position;
    private String _ImmediateSupervisor;
    private String _BasicSalary;
    private String _RiceSubsidy;
    private String _PhoneAllowance;
    private String _ClothingAllowance;
    private String _GrossSemiSalary;
    private String _HourlyRate;
    
  
    /**
     * GETTER AND SETTER METHODS
     * This section contains the declaration for the methods to be used for
     * accessing (get) and assigning (set) values to the attributes
     * @return 
     */
    //GETTER METHODS
   
    public String GetemployeeNo(){
        return _employeeNo;
    }
       
    public String GetlastName(){
        return _lastName;
    }
    
    public String GetfirstName(){
        return _firstName;
    }
    
    public String GetBirthday(){
        return _Birthday;
    }
    
    public String GetAddress(){
        return _Address;
    }
    
    public String GetphoneNumber(){
        return _phoneNumber;
    }
    
    public String GetSSS(){
        return _SSS;
    }
    
    public String GetPhilhealth(){
        return _Philhealth;
    }
    public String GetTIN(){
        return _TIN;
    }
    
    public String GetPagibig(){
        return _Pagibig;
    }
    public String GetStatus(){
        return _Status;
    }
    public String GetPosition(){
        return _Position;
    }
    public String GetImmediateSupervisor(){
        return _ImmediateSupervisor;
    }
    public String GetBasicSalary(){
        return _BasicSalary;
    }
    public String GetRiceSubsidy(){
        return _RiceSubsidy;
    }
    public String GetPhoneAllowance(){
        return _PhoneAllowance;
    }
    public String GetClothingAllowance(){
        return _ClothingAllowance;
    }
    public String GetGrossSemiSalary(){
        return _GrossSemiSalary;
    }
    public String GetHourlyRate(){
        return _HourlyRate;
    }
       
    //SETTER METHODS
    public void SetemployeeNo(String employeeNo){
        _employeeNo = employeeNo;
    }
    
    public void SetlastName(String lastName){
        _lastName = lastName;
    }
    
    public void SetfirstName(String firstName){
        _firstName = firstName;
    }
    public void SetBirthday(String Birthday){
        _Birthday = Birthday;
    }
    public void SetAdress(String Address){
        _Address = Address;
    }
    public void SetphoneNumber(String phoneNumber){
        _phoneNumber = phoneNumber;
    }public void SetSSS(String SSS){
        _SSS = SSS;
    }
    public void SetPhilhealth(String Philhealth){
        _Philhealth = Philhealth;
    }
    public void SetTIN(String TIN){
        _TIN = TIN;
    }
    public void SetPagibig(String Pagibig){
        _Pagibig = Pagibig;
    }
    public void SetStatus(String Status){
        _Status = Status;
    }
    public void SetPosition(String Position){
        _Position = Position;
    }
    public void SetImmediateSupervisor(String ImmediateSupervisor){
        _ImmediateSupervisor = ImmediateSupervisor;
    }
    public void SetBasicSalary(String BasicSalary){
        _BasicSalary = BasicSalary;
    }public void SetRiceSubsidy(String RiceSubsidy){
        _RiceSubsidy = RiceSubsidy;
    }public void SetPhoneAllowance(String PhoneAllowance){
        _PhoneAllowance = PhoneAllowance;
    }
    public void SetClothingAllowance(String ClothingAllowance){
        _ClothingAllowance = ClothingAllowance;
    }
    public void SetGrossSemiSalary(String GrossSemiSalary){
        _GrossSemiSalary = GrossSemiSalary;
    }
    public void SetHourlyRate(String HourlyRate){
        _HourlyRate = HourlyRate;
    }


  

    
    public void DisplayEmployeeDetails(String employeeNo) throws FileNotFoundException, IOException, CsvValidationException {
        String filename = "Employeeinfo.csv";
        CSVReader reader = new CSVReader(new FileReader(filename));
        String[] header = reader.readNext();
        
        String[] record;
        while ((record = reader.readNext()) != null) {
            if (record[0].equals(employeeNo)) {
                _employeeNo = record[0];
                _lastName = record[1];
                _firstName = record[2];
                _Birthday = record[3];
                _Address = record[4];
                _phoneNumber = record[5];
                _SSS = record[6];
                _Philhealth = record[7];
                _TIN = record[8];
                _Pagibig = record[9];
                _Status = record[10];
                _Position = record[11];
                _ImmediateSupervisor = record[12];
                _BasicSalary = record[13];
                _RiceSubsidy = record[14];
                _PhoneAllowance = record[15];
                _ClothingAllowance = record[16];
                _GrossSemiSalary = record[17];
                _HourlyRate = record[18];
                
            }
        } 
    }
}
   
   
