package com.artemnizhnyk.livecoding;


import java.util.*;

public class InterviewTask {


    static Collection<String> input = Arrays.asList(

            " name: watch,  price: 44.6 ",

            " name: headphones,  price: 3 ",

            "",

            " name: cup,  price: 0.99 ",

            " name:,price:",

            " name: smartphone,  price: 1254 "

    );


    public static void main(String[] args) {

        Collection<Product> result = new InterviewTask().createProducts(input);

        result.forEach(System.out::println);

    }


    public Collection<Product> createProducts(Collection<String> data) {
        ArrayList<Product> products = new ArrayList<>();
        data = null;
        List<String> list = data.stream().toList();

        for (int i = 0; i < data.size(); i++) {
            if (list.get(i).length() <= 0) {
                continue;
            }
            String[] split = list.get(i).stripIndent().split(",");

            String nameEl = split[0];
            String priceEl = split[1];

            if (nameEl.endsWith(":") || priceEl.endsWith(":")) {
                continue;
            }

            String name = split[0].substring(nameEl.indexOf(" ")).strip();
            Double price = Double.parseDouble(priceEl.strip().substring(split[1].strip().indexOf(" ")).strip());

            Product product = new Product(name, price);
            products.add(product);

            products.sort(Comparator.comparingDouble(el -> el.price));
        }

        // TODO

        // 1. Create class Product with unique id, name and price

        // 2. Use data parameter and create collection that contains all products.

        // 3. Sort collection by price

        // 4. Write and run some unit tests to check if method works as expected
    return products;
    }

    class Product {
        private String id;
        private String name;
        private Double price;

        public Product(String name, Double price) {
            this.id = UUID.randomUUID().toString();
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(price, product.price);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, price);
        }
    }
}

