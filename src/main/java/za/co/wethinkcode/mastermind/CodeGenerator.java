package za.co.wethinkcode.mastermind;

import java.util.Random;

public class CodeGenerator {
    private final Random random;

    public CodeGenerator(){
        this.random = new Random();
    }

    public CodeGenerator(Random random){
        this.random = random;
    }

    /**
     * Generates a random 4 digit code, using this.random, where each digit is in the range 1 to 8 only.
     * Duplicated digits are allowed.
     * @return the generated 4-digit code
     */

//    This method generates a random four-digit code by generating four random digits in the range of 1 to 8
//    (inclusive) and concatenating them into a StringBuilder object, which is then returned as a String
    public String generateCode(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 4; i++){
            int digit = this.random.nextInt(8);
            digit++;
            result.append(digit);
        }
        return result.toString();
    }
}
