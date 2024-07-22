package com.artemnizhnyk.livecoding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InterviewTaskTest {

    private InterviewTask  interviewTask = new InterviewTask();

    void listOfStringsIsPassed_shouldParseAndReturnSortedByPriceList() {
//        //given
//        List<InterviewTask.Product> products = new ArrayList<>(List.of(
//                new InterviewTask.Product("watch", 44.6),
//                new InterviewTask.Product("watch", 44.6),
//                new InterviewTask.Product("watch", 44.6),
//        ));
//
//
//        //when
//        Collection<InterviewTask.Product> result = interviewTask.createProducts(productsBeforeCreateProducts);
//
//        //then


    }

    private static List<String> getStringsData() {
        List<String> productsBeforeCreateProducts = new ArrayList<>(List.of(
                " name: watch,  price: 44.6 ",

                " name: headphones,  price: 3 ",

                "",

                " name: cup,  price: 0.99 ",

                " name:,price:",

                " name: smartphone,  price: 1254 "
        ));
        return productsBeforeCreateProducts;
    }

}
