package com.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Maps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("James"), new Diamond("African Diamond"));

        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(map.get(new Person("James")));
    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alex"));
        map.put(2, new Person("Alex 2"));
        map.put(3, new Person("Carter"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.remove(3);
        map.entrySet().forEach(System.out::println);
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()  ));
        map.forEach(((key, person) -> {
            System.out.println(key + " - " + person);
        }));
        System.out.println(map.getOrDefault(3, new Person("Smith")));
        System.out.println(map.values());
    }


    // record Person(String name){}

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    record Diamond(String name){}
}

