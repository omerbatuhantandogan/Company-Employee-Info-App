import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int id;
        EmployeeSys.addEmployee();
        EmployeeSys.calculateEmployeeHolidays();
        EmployeeSys.addManagerSalary();
       
        String out=null;
        System.out.println("Content of the array list");
        out=EmployeeSys.display();
        System.out.println(out);
        System.out.println("All Employees are added.");
        System.out.print("\nEnter the employee id you want to search: ");
        id= sc.nextInt();
        Employee emp=EmployeeSys.searchEmployee(id);
        if(emp!=null){
        System.out.println(emp.toString());
        }
        else{
        System.out.println("Employee you search has not found.");
        }
         boolean isRemoved;
        System.out.print("\nEnter employee id to delete: ");
        id=sc.nextInt();
        isRemoved=EmployeeSys.removeEmployee(id);
        if(isRemoved){
        System.out.println("Employee is deleted.");
        }

        else{
        System.out.println("Employee is not deleted");
        }

         out=null;
        System.out.println("Content of the array list");
        out=EmployeeSys.display();
        System.out.println(out);

        EmployeeSys.calculateEmployeeEducationRatio();
        EmployeeSys.calculateEmployeeGenderRatio();




    }
}
