package ch006.statik_keyword.validation;

public class ProductValidator {

    public boolean isValid(Product product){
if (product.price>0 && product.name.isEmpty())
{
    return true;
}
else {
    return false;
}
    }
}
