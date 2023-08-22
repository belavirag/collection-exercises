package dev.belavirag.exercises.collections;

import java.time.DayOfWeek;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ch4();
    }

    public static void ex1() {
        List<String> days = new ArrayList<>();
        for (DayOfWeek value : DayOfWeek.values()) {
            days.add(value.name());
        }

        System.out.println(days);
    }

    public static void ex2() {
        List<String> days = new ArrayList<>();
        for (DayOfWeek value : DayOfWeek.values()) {
            days.add(value.name());
        }

        for (String day : days) {
            System.out.println(day);
        }
    }

    public static void ex3() {
        List<String> days = new ArrayList<>();
        for (DayOfWeek value : DayOfWeek.values()) {
            if (value == DayOfWeek.THURSDAY) {
                continue;
            }
            days.add(value.name());
        }
        days.add(DayOfWeek.THURSDAY.name());
    }

    public static void ex4() {
        List<DayOfWeek> days = Arrays.stream(DayOfWeek.values()).toList();
        List<DayOfWeek> subList = days.subList(0, 3);
        System.out.println(subList);

    }

    public static void ex5() {
        HashSet<DayOfWeek> days = new HashSet<>(Arrays.asList(DayOfWeek.values()));
        days.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
    }

    public static void ex6() {
        HashSet<DayOfWeek> days = new HashSet<>(Arrays.asList(DayOfWeek.values()));
        List<DayOfWeek> daysArrayList = days.stream().toList();

        System.out.println(daysArrayList);
    }

    private static HashSet<String> getRandomNames() {
        String[] nameList = {"Amble", "Ambler", "Ambrogino", "Ambrogio", "Ambros", "Ambrosane", "Ambrose", "Ambrosi", "Ambrosia", "Ambrosine", "Ambrosio", "Ambrosius", "Ambur", "Amby", "Ame", "Amedeo", "Amelia", "Amelie", "Amelina", "Ameline", "Amelita", "Amena", "Amend", "Amerigo", "Amero", "Amersham", "Amery", "Ames", "Amethist", "Amethyst", "Ami", "Amias", "Amice", "Amick", "Amie", "Amiel", "Amieva", "Amii", "Amil", "Bail", "Bailar", "Bailey", "Bailie", "Baillie", "Baillieu", "Baily", "Bain", "Bainbridge", "Bainbrudge", "Bainter", "Baird", "Baiss", "Bajaj", "Bak", "Bakeman", "Bakemeier"};
        Random random = new Random();
        HashSet<String> names = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            names.add(nameList[random.nextInt(nameList.length)]);
        }

        return names;
    }

    public static void ex7() {
        HashSet<String> names = getRandomNames();
        List<String> namesArray = new ArrayList<>(names.stream().toList());
        namesArray.sort((a, b) -> a.compareTo(b));

        for (String name : namesArray) {
            System.out.println(name);
        }
    }

    public static void ex8() {
        HashSet<String> names = getRandomNames();
        TreeSet<String> namesSorted = new TreeSet<>(names);

        for (String name : namesSorted) {
            System.out.println(name);
        }

    }

    private static HashMap<Integer, String> getCarBrands() {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(1, "Trabant");
        cars.put(2, "Volkswagen");
        cars.put(3, "Audi");
        cars.put(4, "Volvo");

        return cars;
    }

    public static void ex9() {
        var carBrands = getCarBrands();

        for (Map.Entry<Integer, String> entry : carBrands.entrySet()) {
            System.out.printf("%d = %s%n", entry.getKey(), entry.getValue());
        }
    }

    public static void ex10() {
        var carBrands = getCarBrands();
        carBrands.keySet().forEach(System.out::println);
    }

    public static void ex11() {
        var carBrands = getCarBrands();
        carBrands.values().forEach(System.out::println);
    }

    public static void ex12() {
        HashMap<Integer, Car> cars = new HashMap<>();
        cars.put(1, new Car(1, "Volvo", "XC60"));
        cars.put(2, new Car(2, "Honda", "Accord"));
        cars.put(3, new Car(3, "Honda", "Civic"));
        cars.put(4, new Car(4, "Audi", "RS4"));

        cars.values().forEach((a) -> System.out.println(a.getBrand()));
    }

    public static void ch1() {
        HashSet<DayOfWeek> allDays = new HashSet<>(Arrays.asList(DayOfWeek.values()));
        HashSet<DayOfWeek> weekends = new HashSet<>(Arrays.asList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY));

        allDays.removeIf(day -> !weekends.contains(day));
        System.out.println(allDays);
    }

    public static void ch2() {
        HashMap<String, String> users = new HashMap<>();
        users.put("hello@example.com", "Someone");
        users.put("something@example.org", "OtherPerson");

        HashSet<String> set = new HashSet<>();
        set.addAll(users.keySet());

        System.out.println(set);
    }

    public static void ch3() {
        ArrayList<SuperHero> heroes = new ArrayList<>();
        heroes.add(new SuperHero(2, 22, "OtherHero"));
        heroes.add(new SuperHero(1, 20, "SomeHero"));
        heroes.add(new SuperHero(3, 23, "ExampleHero"));

        heroes.sort(null);
        System.out.println(heroes);
    }

    public static void ch4() {
        Integer[] arr = new Integer[]{1, 4, 4, 2, 6, 7};
        List<Integer> collection = Arrays.stream(arr).distinct().toList();
        collection.forEach(System.out::println);
    }
}