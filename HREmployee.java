import java.util.HashSet;
import java.util.Scanner;

public class HREmployee extends Employee{
    public HashSet<CellPhone> cellPhoneHashSet= new HashSet();

    public HREmployee(){
        super();
    }

    public void getInput(){
        super.getInput();
        Scanner sc= new Scanner(System.in);
        System.out.print("\nHow many cell phones do you want to add?: ");
        int size=sc.nextInt();
        CellPhone cp;

        for(int i=0;i<size;i++){
            cp=new CellPhone();
            cp.getInput();
            cellPhoneHashSet.add(cp);
        }
    }

    public String toString(){
        String cpStr="\n\tCellPhones: ";
        for(CellPhone cp: cellPhoneHashSet){
            cpStr+= cp.toString()+"\n";
        }
        return "\nHR Employee"
                +super.toString()+
                cpStr;
    }

    public void calcSalary(){
    	hourlySal=100;
     
        salary=hourlySal*workingHour;
    }

    public void calcMonthlyBonus(){
        if(workingHour>100){
            salary+=(workingHour-100)*50;

        }
    }
}