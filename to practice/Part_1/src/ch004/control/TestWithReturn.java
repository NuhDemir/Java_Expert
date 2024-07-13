package ch004.control;
//Return anahtar sözcüğünün iki amacı vardır:
//1. Methodun hangi değeri döndüreceği(boş bir dönüş değeri yoksa)
//2. Geçerli methodun çıkmasına neden olur, bu değeri döndürür.

//void döndüren bir methodda return deyiminiz yoksa, bu methodun sonunda örtük bir return vardır, bu nedenle her zaman bir return deyimi eklemeniz gerekmez.

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
