import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSys {

  public static  ArrayList<Employee> empList = new ArrayList<>();

    public static void addEmployee() {
        ITEmployee ite;
        HREmployee hre;
        ACEmployee ace;
        Employee emp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many employee do you want to add : ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("\nEnter type of the department (IT/AC/HR):  ");
            String type = sc.next();

            if(type.equalsIgnoreCase("IT")) {
                 ite= new ITEmployee();
                ite.getInput();
                ite.calcSalary();
                ite.calcMonthlyBonus();
                empList.add(ite);
            }
            else  if(type.equalsIgnoreCase("AC")) {
                ace = new ACEmployee();
                ace.getInput();
                ace.calcSalary();
                ace.calcMonthlyBonus();
                empList.add(ace);
            }
            else {
                hre = new HREmployee();
                hre.getInput();
                hre.calcSalary();
                hre.calcMonthlyBonus();
                empList.add(hre);
            }
        }
    }
    public static boolean removeEmployee(int id) {
        boolean removed = false;
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).findEmployee(id)) {
                empList.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }



    public static Employee searchEmployee(int id) {
        Employee employee = null;
        for (Employee l : empList) {
            if (l.findEmployee(id)) {
                employee = l;
                break;
            }
        }
        return employee;
    }

    public static String display() {
        Employee temp;
        String out = "";

        for (int i = 0; i < empList.size(); i++) {
            out += empList.get(i).toString() + "\n\n";
        }

        return out;
    }


    public static void calculateEmployeeHolidays(){
        int legallyRequiredHolidays = 30; //base holiday days for everyone
        //employees have to work for 11(months)*22(days)*9(hours) hours a year if the employee does not fill the working hour quota they will get holidays removed as penalty
        //I probably would not be a great boss
        for (int i = 0; i < empList.size(); i++){
            if(empList.get(i).getWorkingHour()<2178){
                empList.get(i).setHolidays(legallyRequiredHolidays - 5);
            } else if (empList.get(i).getWorkingHour()>2178) {
                empList.get(i).setHolidays(legallyRequiredHolidays + 5);//over workers shall be rewarded with extra holidays therefore I am a great boss
            }
            else
                empList.get(i).setHolidays(30);
        }

    }

    public static void calculateEmployeeEducationRatio(){
        int hs = 0, b = 0, m = 0, phd = 0, all = 0;

        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).getEducationLevel().equalsIgnoreCase("hs")){
                hs+=1;
            } else if (empList.get(i).getEducationLevel().equalsIgnoreCase("bachelor")) {
                b+=1;
            } else if (empList.get(i).getEducationLevel() .equalsIgnoreCase("master")) {
                m+=1;
            } else if (empList.get(i).getEducationLevel().equalsIgnoreCase("phd")) {
                phd+=1;
            }
        }
        all = hs + b + m + phd;
        System.out.println("\nEducation Level Ratio: \nHigh School: " +hs +"/" +all +"\nBachelor: " +b +"/" +all +"\nMaster: " +m +"/" +all +"\nPhD: " +phd +"/" +all);
    }

    public static void calculateEmployeeGenderRatio(){
        int fem = 0, masc = 0,  all = 0;

        for (int i = 0; i < empList.size(); i++){
            if(empList.get(i).getGender().equalsIgnoreCase("F")){
                fem+=1;

            } else if (empList.get(i).getGender().equalsIgnoreCase("M")) {
                masc+=1;
           
        }
        all = fem + masc;
        System.out.println("\nGender Avg: \nFemale Avg: " +fem +"/" +all +"\nMale Avg: " +masc +"/" +all);
    }
    }

    public static void addManagerSalary(){
        for (int i = 0; i < empList.size(); i++){
            if (empList.get(i).getIsManager()==true){
                empList.get(i).setSalary( empList.get(i).getSalary()+1500);
            }
        }
    }

}