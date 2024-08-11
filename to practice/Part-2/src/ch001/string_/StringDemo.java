package ch001.string_;

public class StringDemo {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        System.out.println("message: " + message);

        System.out.println("--------");
        System.out.println("Eleman Sayısı: " + message.length());
        System.out.println("5. eleman: " + message.charAt(5));
        System.out.println(message.concat(". Yaşasın!!!"));
        System.out.println("message: " + message);
        System.out.println("'B' ile başlıyor mu?: " + message.startsWith("B"));
        System.out.println("L ile bitiyor mu?: " + message.toLowerCase().endsWith("l"));
        char[] character = new char[5];
        message.getChars(0, 4, character, 1);
        System.out.println("character: " + character);

        System.out.println("a kaçıncı eleman: " + message.indexOf("a"));
        System.out.println("a kaçıncı eleman(aramaya sondan başlar): " + message.lastIndexOf("a"));
        String newMessage = message.replace(' ', '-');
        System.out.println("yer değiştirme: " + newMessage);
        System.out.println("tüm kelimeleri küçült: "+newMessage.toLowerCase());
    System.out.println("tüm kelimeleri büyüt: "+newMessage.toUpperCase());
    }


}
