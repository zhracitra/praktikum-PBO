package latihankontruktordestruktor;

public class Kalkulator {
	private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setNameProject() {
        System.out.println("Project Calculator");
    }

    public void setNoteProject(String note) {
        System.out.println("This project shown you how to manage method in java");
    }

    public double add(double val1, double val2) {
        return val1 + val2;
    }

    public double subtract(double val1, double val2) {
        return val1 - val2;
    }

    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }

    public double division(double val1, double val2) {
        if (val2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return val1 / val2;
    }

    public static void main(String[] args) {
        Kalkulator calculator = new Kalkulator();
       
        calculator.setValue1(7.0);
        calculator.setValue2(5.0);

        System.out.println("VALUE 1 = " + calculator.getValue1());
        System.out.println("VALUE 2 = " + calculator.getValue2());

        calculator.setNameProject();
        calculator.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result Add is = " + calculator.add(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Minus is = " + calculator.subtract(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Multiple is = " + calculator.multiplication(calculator.getValue1(), calculator.getValue2()));
        System.out.println("Result Division is = " + calculator.division(calculator.getValue1(), calculator.getValue2()));
    }
}



