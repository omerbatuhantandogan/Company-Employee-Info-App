import java.util.Scanner;

public abstract class Employee implements  EmployeeInterface{


	protected int id;
    protected String nameSurname;
    protected String gender;
    protected String educationLevel;
    protected int phoneNumber;
    protected double hourlySal;
    protected int workingHour;
    protected double salary;
    protected boolean isManager;
    protected int holidays;
    protected static int prevId=100;



    public Employee(){
    this.id=prevId++;
    }
    
    
    public int getHolidays() {
		return holidays;
	}


	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}


	public boolean getIsManager() {
		return isManager;
	}

	public void setisManager(boolean isManager) {
		this.isManager = isManager;
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

    public void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee name surname: ");
        nameSurname = sc.nextLine();
        System.out.print("\nEnter employee gender (M/F): ");
        gender = sc.next();
        System.out.print("\nEnter employee education level (HS/Bachelor/Master/PhD): ");
        educationLevel = sc.next();
        System.out.print("\nEnter employee phone number: ");
        phoneNumber = sc.nextInt();
        System.out.print("\nEnter employee working hours: ");
        workingHour = sc.nextInt();
        sc.skip("\\R");
        System.out.println("\nIs the employee a manager?(yes/no): ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            isManager = true;
        }else if (answer.equalsIgnoreCase("no")){
            isManager = false;
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
                +"\nEmployee total salary: "+salary
                +"\nEmployee manager status: "+isManager;
    }

    public abstract void calcSalary();

    
}
