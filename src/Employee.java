import java.util.Scanner;

public abstract class Employee {
    protected static int id=100;
    protected String nameSurname;
    protected String gender;
    protected String educationLevel;
    protected int phoneNumber;
    protected double hourlySal;
    protected int workingHour;
    protected double salary;
    protected boolean isManager;



    public Employee(){
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlySal() {
        return hourlySal;
    }

    public void setHourlySal(double hourlySal) {
        this.hourlySal = hourlySal;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean findEmployee(int id){
        return this.id==id;
    }

    public boolean getIsManager() {
        return this.isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee name surname: ");
        this.nameSurname = sc.nextLine();
        System.out.print("\nEnter employee gender (M/F): ");
        this.gender = sc.next();
        System.out.print("\nEnter employee education level (HS/Bachelor/Master/PhD): ");
        this.educationLevel = sc.next();
        System.out.print("\nEnter employee phoneNumber: ");
        this.phoneNumber = sc.nextInt();
        System.out.print("\nEnter employee working hours: ");
        this.workingHour = sc.nextInt();
        System.out.println("\nIs the employee a manager?(yes/no): ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            this.isManager = true;
        }else if (answer.equalsIgnoreCase("no")){
            this.isManager = false;
        }
    }

    public String toString(){
        return "\nEmployee id: "+id
                +"\nEmployee name surname: "+nameSurname
                +"\nEmployee gender: "+gender
                +"\nEmployee education level: "+educationLevel
                +"\nEmployee phone number: "+phoneNumber
                +"\nEmployee hourly salary: "+hourlySal
                +"\nEmployee working hours: "+workingHour
                +"\nEmployee total salary: "+salary;
    }

    public abstract void calculateSalary();

}

