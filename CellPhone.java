import java.util.Scanner;

public class CellPhone {
private String phoneBrand;
private int memory;

public CellPhone(){

}

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void getInput(){
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter the cell phone brand that is used by the HR Employee: ");
    phoneBrand=sc.next();
    System.out.print("\nEnter the memory of the cell: ");
    memory=sc.nextInt();
}

public String toString(){
    return "\n\tPhone brand: "+phoneBrand
            +"\n\tMemory: "+memory;
}
}