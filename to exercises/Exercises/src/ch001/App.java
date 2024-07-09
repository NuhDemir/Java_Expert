package ch001;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) throws Exception {

        List<Employee> employees = Arrays.asList(
                new Employee("Ahmet Dağ",21d),
                new Employee("Salih Aydın",22d),
                new Employee("Asel Mavi",23d),
                new Employee("Durmuş Özer",26d),
                new Employee("Akın Arık",25d)
                );
       writeList(employees);

        Collections.sort(employees);
      System.out.println("---");
      writeList(employees);
    }

private static void writeList(Iterable  collection)
{
    for (Object item: collection)
    {
        System.out.println(item);
    }
}

}
