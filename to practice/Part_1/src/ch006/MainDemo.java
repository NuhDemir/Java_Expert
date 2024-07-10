package ch006;

public class MainDemo {

    public static void main(String[] args) {
        if (args.length == 3) {
            String name = args[0];
String lastName  = args[1];
String age = args[2];
System.out.println(name+ " " +lastName +" " +age);

        }
 else {
     System.out.println("Please provide three arguments!");
     System.exit(1);
        }

 int length = args.length;
 System.out.println(length +"tane arguman geçti. ");


 for (String s:args)
     System.out.println(s);

 int intAge = Integer.parseInt((args[2]));
 System.out.println(intAge *2);
    }
}
