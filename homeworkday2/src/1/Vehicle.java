import java.sql.SQLOutput;

public class Vehicle {

    public String speedset;
    public String size;// 属性声明

    @Override
    public String toString() {
        return "Vehicle{" +
                "speedset='" + speedset + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void speedup(){
        System.out.println("加速");
    }

public void speeddown(){
        System.out.println("减速");
    }


}

