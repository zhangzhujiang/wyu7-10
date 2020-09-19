public class VechicleTest {


    private static Object VechicleTest;

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.size = "aa";
        vehicle.speedset="bbb";
        System.out.println(vehicle);
        vehicle.speedup();
        vehicle.speeddown();
    }


        }

