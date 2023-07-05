import java.util.ArrayList;

public class EmployeeSys {

    ArrayList<Employee> emp = new ArrayList<>();

    public void addEmployee(){}

    public boolean removeEmployee(){
        return false;
    }

    public ArrayList<Employee> searchEmployee(){
        return emp;
    }

    public String display(){
        return " ";
    }

    public void calculateEmployeeHolidays(){
        int legallyRequiredHolidays = 30; //base holiday days for everyone
        int earnedHolidays = 0;//employees have to work for 11(months)*22(days)*9(hours) hours a year if the employee does not fill the working hour quota they will get holidays removed as penalty
        //I probably would not be a great boss
        for (int i = 0; i < emp.size(); i++){
            if(emp.get(i).getWorkingHour()<2178){
                earnedHolidays = legallyRequiredHolidays - 5;
            } else if (emp.get(i).getWorkingHour()>2178) {
                earnedHolidays = legallyRequiredHolidays + 5; //over workers shall be rewarded with extra holidays therefore I am a great boss
            }
            else
                earnedHolidays = 30;
        }

    }

    public void calculateEmployeeEducationAverage(){
        double hsAvg = 0, bAvg = 0, mAvg = 0, phdAvg = 0, all = 0;

        for(int i = 0; i < emp.size(); i++){
            if(emp.get(i).getEducationLevel() == "HS"){
                hsAvg++;
            } else if (emp.get(i).getEducationLevel() == "Bachelor") {
                bAvg++;
            } else if (emp.get(i).getEducationLevel() == "Master") {
                mAvg++;
            } else if (emp.get(i).getEducationLevel() == "PhD") {
                phdAvg++;
            }
        }
        all = hsAvg + bAvg + mAvg + phdAvg;
        System.out.println("\nEducation Level Avg: \nHigh School: " +hsAvg +"/" +all +"\nBachelor: " +bAvg +"/" +all +"\nMaster: " +mAvg +"/" +all +"\nPhD: " +phdAvg +"/" +all);
    }

    public void calculateEmployeeGenderAverage(){
        double femAvg = 0, mascAvg = 0;
        double all = 0;

        for (int i = 0; i < emp.size(); i++){
            if(emp.get(i).getGender().equalsIgnoreCase("F")){
                femAvg++;

            } else if (emp.get(i).getGender().equalsIgnoreCase("M")) {
                mascAvg++;
            }
        }
        all = femAvg + mascAvg;
        System.out.println("\nGender Avg: \nFemale Avg: " +femAvg +"/" +all +"\nMale Avg: " +mascAvg +"/" +all);
    }

    public void addManagerSalary(){
        for (int i = 0; i < emp.size(); i++){
            if (emp.get(i).getIsManager()==true){
                emp.get(i).setSalary( emp.get(i).getSalary()+1500);
            }
        }
    }

}
