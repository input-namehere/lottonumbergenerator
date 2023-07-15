import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoNumberGenerator {
    private int minNumber;
    private int maxNumber;
    private int numberOfBalls;

    public LottoNumberGenerator(int minNumber, int maxNumber, int numberOfBalls) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.numberOfBalls = numberOfBalls;
    }

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
