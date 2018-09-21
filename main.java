public class Main {

    public static void main(String[] args) {
	// write your code here
        double dx1 = 5.0;
        double dx2 = 4.0;
        double dx3 = -3.0;
        double dy1 = 2.0;
        double dy2 = 9.0;
        double dy3 = 2.0;
        double dz1 = -5.0;
        double dz2 = 2.0;
        double dz3 = 6.0;

        double distance1 = (Math.sqrt(Math.pow(dy1-dy2,2)+ (Math.pow(dx1-dx2,2)+ (Math.pow(dz1-dz2,2)))));
        double distance2 = (Math.sqrt(Math.pow(dy1-dy3,2)+ (Math.pow(dx1-dx3,2)+ (Math.pow(dz1-dz3,2)))));
        double distance3 = (Math.sqrt(Math.pow(dy2-dy3,2)+ (Math.pow(dx2-dx3,2)+ (Math.pow(dz2-dz3,2)))));
        double max = Math.max((int)distance1,distance2);
        double max2 = Math.max((int)distance1,distance3);
        double max3 = Math.max(max,max2);
        double min = Math.min(distance1,distance2);
        double min2 = Math.min(distance1,distance3);
        double min3 = Math.min(min,min2);
        System.out.println("The minimum distance is " + min3 + ".");
        System.out.println("The maximum distance is " + max3 + ".");
    }
}
