package ch006.statik_keyword;



public class Citizien {

    String tckno;
    String firstName;
    String lastName;




        static String notionality;

        static String getNotionality(){
            return notionality;
        }

    public static void main(String[] args) {
        Citizien c1 = new Citizien();
        c1.tckno = "12345";
        c1.firstName= "Mehmet";
        c1.lastName="Akın";

        Citizien c2= new Citizien();
        c2.tckno="23456";
        c2.firstName="Ali";
        c2.lastName="Ural";

        Citizien c3=new Citizien();
        c3.tckno="098765";
        c3.firstName="Salih";
        c3.lastName="Sual";

        Citizien.notionality="Turkiye Cumhuriyeti";

        System.out.println("Nationality: "+Citizien.notionality);
        System.out.println("Mehmet's nationality: ");
    }

}
