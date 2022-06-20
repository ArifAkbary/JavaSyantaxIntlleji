package Class19;

public class SDET extends Human {
    boolean goodwithjava;
    SDET(String name,String eyeColor, String job, int age, boolean goodwithjava){
        this.name=name;
        this.eyeColor=eyeColor;
        this.job=job;
        this.job=job;
    }
    void PrintInfo(){
        System.out.println("my name is " +name+ "i do "+ job+" and i am good with java "+goodwithjava);
    }

    public static void main(String[] args) {
        SDET sdet=new SDET("Arif","black","gym",21,true);
        sdet.PrintInfo();
    }
}
