import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * LottoNumberGenerator class represents a lotto number generator that can generate unique random numbers
 * within a specified range and quantity of balls.
 */
public class LottoNumberGenerator {
    private int minNumber;
    private int maxNumber;
    private int numberOfBalls;

    /**
     * Constructs a LottoNumberGenerator object with the specified range and quantity of balls.
     *
     * @param minNumber     the minimum number in the range (inclusive)
     * @param maxNumber     the maximum number in the range (inclusive)
     * @param numberOfBalls the quantity of balls to be selected
     */
    public LottoNumberGenerator(int minNumber, int maxNumber, int numberOfBalls) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.numberOfBalls = numberOfBalls;
    }

    /**
     * Generates a set of unique random lotto numbers within the specified range and quantity of balls.
     *
     * @return a Set of generated lotto numbers
     */
    public Set<Integer> generateNumbers() {
        Set<Integer> generatedNumbers = new HashSet<>();
        Random random = new Random();

        // Generate unique random numbers
        while (generatedNumbers.size() < numberOfBalls) {
            int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            generatedNumbers.add(randomNumber);
        }

        return generatedNumbers;
    }

    /**
     * The entry point of the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minNumber = 40;
        int maxNumber = 49;
        int numberOfBalls = 6;

        LottoNumberGenerator generator = new LottoNumberGenerator(minNumber, maxNumber, numberOfBalls);
        Set<Integer> generatedNumbers = generator.generateNumbers();

        // Print the generated numbers
        System.out.println("Generated Lotto Numbers:");
        for (int number : generatedNumbers) {
            System.out.print(number + " ");
        }
    }
}
