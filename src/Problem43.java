public class Problem43 {
    /**
     *
     */
    public static void main(String[] args) {
        Problem43 problem43 = new Problem43();
        System.out.println(problem43.multiply("2", "3"));
    }


    public Problem43() {
        System.out.println("Problem43: ");
    }

    public String multiply(String num1, String num2) {
        int i = num1.length() - 1;
        int numOne = 0;
        int facTen = 0;
        while (i > -1) {


            numOne += (getInt(num1.charAt(i))* Math.pow(10, facTen));
            facTen++;
            i--;
        }
        i = num2.length() - 1;
        int numTwo = 0;
        facTen = 0;
        while (i > -1) {
            numTwo += (getInt(num2.charAt(i))* Math.pow(10, facTen));
            facTen++;
            i--;
        }
        return (numOne * numTwo) + "";
    }

    private int getInt(char charToInt) {
        return switch (charToInt) {
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            default -> throw new UnsupportedOperationException("that aint it boss");
        };
    }


}