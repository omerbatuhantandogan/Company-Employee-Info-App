import java.util.Scanner;

public class ACEmployee extends Employee{
    private String typeOfSW;

    public ACEmployee(){
        super();
    }

    public void getInput(){
        Scanner sc=new Scanner(System.in);
        super.getInput();
        System.out.print("\nEnter the type of software that is used by the accountance employee: ");
        typeOfSW=sc.nextLine();
    }

    public void calcSalary(){
    	hourlySal=200;
        salary=hourlySal*workingHour;
    }

    public void calcMonthlyBonus(){
        if(workingHour>100){
            salary+=(workingHour-100)*50;
        }
    }


    public String toString(){
        return "\nAC Employee: "
                +super.toString()
                +"\nType of software: "+typeOfSW;
    }
}