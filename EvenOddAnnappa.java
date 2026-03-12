public class EvenOddAnnappa {

    public static void main(String[] args) {

        int randomNumberAnnappa;

        randomNumberAnnappa = (int)(Math.random() * 100) + 1;

        System.out.println("A random number between 1 and 100 was generated.");
        System.out.println("The number is: " + randomNumberAnnappa);

        if (randomNumberAnnappa % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }

    }
}