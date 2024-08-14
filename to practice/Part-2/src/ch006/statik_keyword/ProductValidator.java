package ch006.statik_keyword;

public class ProductValidator {

    public ProductValidator() {
        System.out.println("Yapıcı Blok çalıştı...ü");
    }

    public boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void getInfo() {
        System.out.println("---");
    }


}


