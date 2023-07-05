import java.util.Scanner;

public class Computer {
    private String compBrand;
    private String CPUModel;
    private String SSDCapacity;

    public Computer(){

    }

    public String getCompBrand() {
        return compBrand;
    }

    public void setCompBrand(String compBrand) {
        this.compBrand = compBrand;
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public void setCPUModel(String CPUModel) {
        this.CPUModel = CPUModel;
    }

    public String getSSDCapacity() {
        return SSDCapacity;
    }

    public void setSSDCapacity(String SSDCapacity) {
        this.SSDCapacity = SSDCapacity;
    }

    public void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter computer brand: ");
        compBrand=sc.next();
        sc.skip("\\R");
        System.out.print("\nEnter CPU model of computer: ");
        CPUModel=sc.nextLine();
        System.out.print("\nEnter SSD Capacity: ");
        SSDCapacity=sc.nextLine();
    }

    public String toString(){
        return "\n\tComputer brand: "+compBrand
                +"\n\tCPU model of the computer: "+CPUModel
                +"\n\tSSD Capacity: "+SSDCapacity;
    }
}