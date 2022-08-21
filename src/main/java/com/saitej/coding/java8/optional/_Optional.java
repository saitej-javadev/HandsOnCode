package com.saitej.coding.java8.optional;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {

        //Ways to create Optional classes
        //empty(),
        // Of(),
        // ofNullable()

        //To create an empty Optional object, we simply need to use its empty() static method:

        Optional<Object> empty = Optional.empty();
        System.out.println("using empty() :" +empty.isPresent());

        // using Of()
        // the argument passed to the of() method can't be null. Otherwise, we'll get a NullPointerException:
        Optional<String> optional = Optional.of("Saitej");
        System.out.println("using Of() :" +optional.isPresent());
        System.out.println(optional.get());

        //using ofNullable()

        Optional<Object> optional1 = Optional.ofNullable(null);
        System.out.println(optional1);

        System.out.println(optional1.orElse("Chintu"));

        String  value = null;
        String name  = Optional.ofNullable(value).orElse("saitej");
        System.out.println(name);
    }
}
