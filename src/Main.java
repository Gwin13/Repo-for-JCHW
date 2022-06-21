public class Main {
    public static void main (String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // в этом месте получим ошибку, т.к делим на ноль. Варианта два, либо поменять всё на "double", т.к он поддерживает бесконечно малое число, или же исправить
        // в классе Calculator 10 строку (в частности обременить условиями переменную devide)
        calc.println.accept(c);

    }
}
