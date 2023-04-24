public class UseArithmeticCalculator {
    public static void main(String[] args) {
        ArithmeticCalculator calculatorAik = new ArithmeticCalculator(11, PlusEnum.DIVISION, 2);
        calculatorAik.operationNumbers();
        calculatorAik.getResult();
    }
}
