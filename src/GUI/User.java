/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author mpowel12
 */
class User {
    private int Customer_ID, Supervisor, Employee_ID,Salary;
    private String SSN,Citizen_Status ,Employment_Status ,Job_Type,First_Name, Middle_Initial, Last_Name, Phone, Email, Address,Start_Date;
    
    public User(int Customer_ID, String First_Name, String Middle_Initial, String Last_Name, String Phone, String Email, String Address ){
        this.Customer_ID=Customer_ID;
        this.First_Name=First_Name; 
        this.Middle_Initial=Middle_Initial;
        this.Last_Name=Last_Name;
        this.Phone=Phone; 
        this.Email=Email;
        this.Address=Address;
    }
    public User( String First_Name, String Middle_Initial, String Last_Name, String Address,String SSN, int Salary, String Phone, int Employee_ID, String Citizen_Status,String Job_Type,String Employment_Status, String Start_Date, int Supervisor){
        this.First_Name=First_Name;
        this.Middle_Initial=Middle_Initial;
        this.Last_Name=Last_Name;
        this.Address= Address;
        this.SSN=SSN;
        this.Salary=Salary;
        this.Phone = Phone;
        this.Employee_ID = Employee_ID;
        this.Citizen_Status = Citizen_Status;
        this.Job_Type = Job_Type;
        this.Employment_Status = Employment_Status;
        this.Start_Date = Start_Date;
        this.Supervisor = Supervisor;
    }
    public User( String First_Name, String Middle_Initial, String Last_Name){
        this.First_Name=First_Name;
        this.Middle_Initial=Middle_Initial;
        this.Last_Name=Last_Name;
    }
            
    public int getCustomer_ID(){
        return Customer_ID;
    
    }
    public String getSSN(){
        return SSN;
    }   
    public int getSalary(){
        return Salary;
    }
    public int getEmployee_ID(){
        return Employee_ID;
    }
    public String getStart_Date(){
        return Start_Date;
    }
    public String getCitizenStatus(){
        return Citizen_Status;
}
    public String getEmployment_Status(){
        return Employment_Status;
    }
    public int getSupervisor(){
        return Supervisor;
    }
    public String getJobType(){
        return Job_Type;
    }
    public String getFirst_Name(){
        return First_Name;
    }public String getMiddle_Initial(){
        return Middle_Initial;
    }public String getLast_Name(){
        return Last_Name;
    }public String getPhone(){
        return Phone;
    }public String getEmail(){
        return Email;
    }public String getAddress(){
        return Address;
    }
}
