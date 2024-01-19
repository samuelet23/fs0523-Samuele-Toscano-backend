package week2.day4;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class usaSito {

    public static void main(String[] args) {
        Product prodotto0 = new Product(0, "Prodotto0", "Books", 20.0);
        Product prodotto1 = new Product(1, "Prodotto1", "Baby", 30.5);
        Product prodotto2 = new Product(2, "Prodotto2", "Books", 10.5);
        Product prodotto3 = new Product(3, "Prodotto3", "Baby", 53.6);
        Product prodotto4 = new Product(4, "Prodotto4", "Boys", 20.8);
        Product prodotto5 = new Product(5, "Prodotto5", "Gaming", 12.4);
        Product prodotto6 = new Product(6, "Prodotto6", "Books", 109.7);
        Product prodotto7 = new Product(7, "Prodotto7", "Boys", 109.7);
        Product prodotto8 = new Product(8, "Prodotto8", "Baby", 10.89);

        List<Product> listOfProducts = List.of(prodotto0,prodotto1, prodotto2,prodotto3, prodotto4, prodotto5, prodotto6, prodotto7, prodotto8);

        Customer client0 = new Customer(0, "Francesco", 2);
        Customer client1 = new Customer(1, "Alberto", 3);
        Customer client2 = new Customer(2, "Giulio", 2);
        Customer client3 = new Customer(3, "Davide", 2);
        Customer client4 = new Customer(4, "Samuele", 4);
        Customer client5 = new Customer(5, "Marco", 1);

        Order order0 = new Order(0, "Effetuato", LocalDate.of(2021,2, 10), LocalDate.of(2021, 10, 12), listOfProducts, client0 );
        Order order1 = new Order(1, "Effetuato", LocalDate.of(2021,3, 10), LocalDate.of(2021, 9, 12), listOfProducts, client2 );
        Order order2 = new Order(2, "Effetuato", LocalDate.of(2023,2, 21), LocalDate.of(2021, 2, 23), listOfProducts, client1 );
        Order order3 = new Order(3, "Effetuato", LocalDate.of(2021,3, 5), LocalDate.of(2021, 5, 10), listOfProducts, client2 );
        Order order4 = new Order(4, "Effetuato", LocalDate.of(2022,11, 10), LocalDate.of(2021, 11, 12), listOfProducts, client5 );

        System.out.println(booksFiltered(listOfProducts));

        List<Order> listOfOrder = List.of(order0,order1, order2, order3,order4);
        System.out.println(babyFiltered(listOfOrder));

        boysFilteredWithDiscount(listOfProducts);
        System.out.println(listOfProducts);

        System.out.println(prodottiOrdinatiClientiLivello2(listOfOrder));

        System.out.println("----------------------");

        System.out.println("Ordini raggrupati per Customer");
        orderByClient(listOfOrder).forEach(((customer, orders) -> {
            System.out.println("Cliente: " + customer.getName() + "Ordini del cliente: " + orders);
        }));

        System.out.println("----------------------");

        System.out.println("Totale Vendite per ogni cliente");
       sellByClient(listOfOrder).forEach(((customer, aDouble) ->{
       System.out.println( "Cliente: " + customer.getName() + "Totale vendite: " + aDouble);
       }));

        System.out.println("----------------------");

        System.out.println("Prodotto più costoso");
        mostExpensiveProducts(listOfProducts).forEach((product -> System.out.println("Prodotto più costoso: " + product)));

        System.out.println("----------------------");

        System.out.println("Media degli importi degli ordini");
        System.out.println("La media degli ordini è: " + averagePriceProduct(listOfOrder));

        System.out.println("----------------------");

        System.out.println("Somma  prezzi per categoria");
        System.out.println(sumByCategory(listOfProducts));

        System.out.println("----------------------");

        salvaProdottiSulDisco(listOfProducts);

        System.out.println("----------------------");

        System.out.println("Prodotti recuperati dal file:" + leggiProdottiSulDisco());
    }
    public  static Map<Customer, List<Order>> orderByClient(List<Order> ordini){
    return ordini.stream().collect(Collectors.groupingBy(Order::getCustomer));
}

    public static Map <Customer, Double> sellByClient(List<Order> ordini){
       return  ordini.stream().collect(Collectors.groupingBy(Order::getCustomer,Collectors.summingDouble(Order::getTotalPrice)));
    }

    public static List<Product> mostExpensiveProducts (List<Product> prodotti){
       return prodotti.stream().reduce((prod, prod2) -> prod.getPrice() > prod2.getPrice() ? prod : prod2).stream().toList();
    }
    public static double averagePriceProduct (List<Order> ordini){
     return ordini.stream().collect(Collectors.averagingDouble(Order::getTotalPrice));
    }
    public static Map<String, Double> sumByCategory (List<Product> prodotti){
       return prodotti.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice)));
    }

    public static void salvaProdottiSulDisco(List<Product> prodotti){
        String  prod = prodotti.toString();
        File file = new File("filepath/file.txt");

        try{
            FileUtils.writeStringToFile(file, prod, Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static List<String> leggiProdottiSulDisco (){
        List<String> prodotti = new ArrayList<>();
        File file = new File("filepath/file.txt");
        try{
            prodotti = FileUtils.readLines(file, Charset.defaultCharset());

        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }

        return prodotti;

    }

        public static List<Product> booksFiltered(List<Product> products){

        Stream<Product> p = products.stream();
        List<Product> listaBooks = p
                .filter(prod -> prod.getCategory().equals("Books") && prod.getPrice() > 100)
                .toList();
        return listaBooks;
    }

    public  static List<Product> babyFiltered (List<Order> orders){
        Stream<Order> ordini = orders.stream();
        List<Product> babyFiltered= ordini
                .flatMap(order -> order.getProducts().stream())
                        .filter(product -> product.getCategory().equals("Baby"))
                        .toList();
        return babyFiltered;
    }

    public static void boysFilteredWithDiscount (List<Product> products){
       products.stream()
        .filter(prod -> prod.getCategory().equals("Boys"))
                .forEach(product -> {
                    double discountProd = product.getPrice() * 0.9;
                    product.setPrice(discountProd);
                });
    }

    public static List<Product> prodottiOrdinatiClientiLivello2(List<Order> ordini){
      List<Product> o =  ordini.stream()
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2021, Month.FEBRUARY, 1) )&& order.getOrderDate().isBefore(LocalDate.of(2021, Month.APRIL, 1)))
                .filter(order -> order.getCustomer().getTier() == 2)
                .flatMap(order -> order.getProducts().stream())
                .toList();
        return o;
    }

}
