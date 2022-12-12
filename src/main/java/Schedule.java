public class Schedule {
    public static void main(String[] args) {
        Shift newShift=new Shift("new",13,30,15,00,12,2,2033);

        System.out.println( newShift.toString());
        newShift.makegroup();
    }
}
