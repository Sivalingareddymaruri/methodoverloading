public class methodoverloading_in_java {
    public static void main(String[] args) {
       System.out.println("5ft 10inches ="+ converttocentimeters(5,10)+"cm");
       System.out.println("68 inches ="+ converttocentimeters(68)+"cm");
    }
    public static double converttocentimeters(int inches){
        return inches*2.54;
    }
    public static double converttocentimeters(int feet,int inches){
        int inchtofeet = feet*12;
        int totalinches=inchtofeet+inches;
        double totalcm = totalinches*2.54;
        return totalcm;
}
}