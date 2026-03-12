public class Main {

    public static void main(String[] args) {

        float earthWeightAnnappa = 53.0f;
        float marsGravityAnnappa = 0.38f;

        float marsWeightAnnappa = earthWeightAnnappa * marsGravityAnnappa;

        System.out.println("My Earth weight is: " + earthWeightAnnappa);
        System.out.println("Mars gravity is 38% of Earth.");
        System.out.println("My weight on Mars (float): " + marsWeightAnnappa);

        double marsWeightDoubleAnnappa = marsWeightAnnappa;
        System.out.printf("Weight on Mars as double: %.4f\n", marsWeightDoubleAnnappa);

        int marsWeightIntAnnappa = (int) marsWeightDoubleAnnappa;
        System.out.println("Weight after casting to int: " + marsWeightIntAnnappa);

        char marsWeightCharAnnappa = (char) marsWeightIntAnnappa;
        System.out.println("Weight converted to char: " + marsWeightCharAnnappa);

        int resultAnnappa = marsWeightCharAnnappa + 5;
        System.out.println("Result after adding 5 to char value: " + resultAnnappa);
    }
}