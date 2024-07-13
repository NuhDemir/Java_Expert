package ch004.control;

public class TestWithReturn {
    static int test(int testval,int target)
    {
        if (testval>target)
            return  +1;
        if (testval<target)
            return  -1;
        return 0;//Match
    }

    public static void main(String[] args) {
        System.out.println(test(10,3));
        System.out.println(test(5,22));
        System.out.println(test(1,5));
    }
}
