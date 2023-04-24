public class ArithmeticCalculator {

    private double result;
    private final double numberOne;
    private final double numberTwo;
    private final PlusEnum typeOperation;


    public ArithmeticCalculator(int numberOneConstructor, PlusEnum type, int numberTwoConstructor) {
        numberOne = numberOneConstructor;
        typeOperation = type;
        numberTwo = numberTwoConstructor;
    }


    public double operationNumbers() {
        if(typeOperation == PlusEnum.PLUS) {
            result = numberOne + numberTwo;
        } else if (typeOperation == PlusEnum.MINUS) {
            result = numberOne - numberTwo;
        } else if(typeOperation == PlusEnum.MULTIPLY) {
            result = numberOne * numberTwo;
        } else if (typeOperation == PlusEnum.DIVISION) {
            result = numberOne / numberTwo;
        }
        return result;
    }

    public void getResult() {
        if (numberOne % numberTwo == 0) {
            System.out.println((int) result);
        } else if (numberOne % numberTwo == 1) {
            System.out.println(result);
        }
    }

    public void getTypeOperation() {
        System.out.println(typeOperation);
    }
}



