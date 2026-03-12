
public class LegoContainersAnnappa {

    public static void main(String[] args) {

        int amountOfBricksAnnappa = 75;
        int containerCapacityAnnappa = 8;

        int fullContainersAnnappa;
        int totalContainersAnnappa;
        int remainingBricksAnnappa;

        System.out.println("Total Lego bricks: " + amountOfBricksAnnappa);
        System.out.println("Container capacity: " + containerCapacityAnnappa);

        fullContainersAnnappa = amountOfBricksAnnappa / containerCapacityAnnappa;
        remainingBricksAnnappa = amountOfBricksAnnappa % containerCapacityAnnappa;

        System.out.println("Full containers: " + fullContainersAnnappa);
        System.out.println("Remaining bricks: " + remainingBricksAnnappa);

        totalContainersAnnappa = fullContainersAnnappa;

        if (remainingBricksAnnappa > 0) {
            totalContainersAnnappa++;
        }

        System.out.println("Total containers needed: " + totalContainersAnnappa);
    }
}