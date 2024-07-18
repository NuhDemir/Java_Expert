package ch008.housekeeping;

public class MethodInit3 {// int j = g(i); //illegal forward reference
    int i = f();
    int f() {return  42;}
    int g(int n) {return  n*42;}
}
