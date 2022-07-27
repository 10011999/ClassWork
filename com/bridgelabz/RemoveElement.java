package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {


        List<String> element = new ArrayList<>();
        System.out.println(element);
        element.add("aditya");
        element.add("abhishek");
        element.add("anirudha");
        element.add("sanket");
        for (String nam:element){
            System.out.println("Element is"+ nam);

        }
        element.remove(3);
        System.out.println("remove element"+element.size());
        for (String nam:element){
            System.out.println("element"+nam);
        }

    }
}