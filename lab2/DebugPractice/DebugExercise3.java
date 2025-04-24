/**
 * Created by jug on 1/22/18.
 */
public class DebugExercise3 {
<<<<<<< HEAD
    public static int countTurnips(In in) {
        int totalTurnips = 0;
=======
    public static long countTurnips(In in) {
        long totalTurnips = 0;
>>>>>>> ef9d78f (second)
        while (!in.isEmpty()) {
            String vendor = in.readString();
            String foodType = in.readString();
            double cost = in.readDouble();
<<<<<<< HEAD
            int numAvailable = in.readInt();
            if (foodType.equals("turnip")) {
                int newTotal = totalTurnips + numAvailable;
=======
            long numAvailable = in.readInt();
            if (foodType.equals("turnip")) {
                long newTotal = totalTurnips + numAvailable;
>>>>>>> ef9d78f (second)
                totalTurnips = newTotal;
            }
            in.readLine();
        }
        return totalTurnips;
    }

    public static void main(String[] args) {
        In in = new In("foods.csv");
        System.out.println(countTurnips(in));
    }
}
