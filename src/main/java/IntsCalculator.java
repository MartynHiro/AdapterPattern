public class IntsCalculator implements Ints {

    protected final Calculator calculator;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = calculator.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);

        formula.calculate(Calculator.Operation.SUM);

        return (int) formula.result();
    }

    @Override
    public int sub(int arg0, int arg1) {
        Calculator.Formula formula = calculator.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);

        formula.calculate(Calculator.Operation.SUB);

        return (int) formula.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = calculator.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);

        formula.calculate(Calculator.Operation.MULT);

        return (int) formula.result();
    }

    @Override
    public double div(int arg0, int arg1) {
        Calculator.Formula formula = calculator.newFormula();

        formula.addOperand(arg0);
        formula.addOperand(arg1);

        formula.calculate(Calculator.Operation.DIV);

        return formula.result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula formula = calculator.newFormula();

        formula.addOperand(a);
        formula.addOperand(b);

        formula.calculate(Calculator.Operation.POW);

        return (int) formula.result();
    }
}
