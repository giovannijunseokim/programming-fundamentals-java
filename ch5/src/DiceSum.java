
public class DiceSum {

    public static void main(String[] args) {
    	int firstDice, secondDice;
        for (firstDice = 1; firstDice <= 6; firstDice++) {
            for (secondDice = 1; secondDice <= 6; secondDice++) {
                if (firstDice + secondDice == 10) {
                    System.out.printf("(%s, %s)\n", firstDice, secondDice);
                }
            }
        }
    }
}