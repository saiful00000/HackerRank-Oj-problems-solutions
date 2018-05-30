package Random;

import javax.sound.midi.SysexMessage;

public class JavaMathClass {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 20;

        // add, substruct, divide, multiply, any two number
        int ans = Math.addExact(number1, number2);
        System.out.println("number1 + number2 = "+ ans);
        //substract
        ans = Math.subtractExact(20, 10);
        System.out.println("20 - 10 = "+ ans);
        //multiply
        ans = Math.multiplyExact(5, 4);
        System.out.println("5 * 4 = "+ ans);
        //divisor
        ans = Math.floorDiv(10, 5);
        System.out.println("10 / 5 = "+ ans);

    }
}
