package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Starter {

    private String sql = """
            INSERT INTO Orders(
            id,name)
            VALUES(?,?)""";

    private int count;

    private void process(Object value) {
        if (value instanceof String text) {
            int count = text.length();
        } else if (value instanceof List elements) {
            int count = elements.size();
        }
    }

    public static void main(String[] args) {
        var items = List.of("1", "2");

        //var elems = Map.of();
        var item = (String) null;

        boolean match = items.stream().peek(System.out::println)
                .anyMatch(s -> s != null);
        System.out.println(match);

        LocalDate date = LocalDate.now();
        LocalDate date1 = date.plusMonths(1);

        Employee employee = new Employee("Peter", 25);
        // String name = employee.getName();
        //String name = employee.name();

//        int arg = 1;
//        switch (arg) {
//            case 1: name = "one";break;
//            case 2: name = "two";break;
//            default: name = "N/A";
//        }
        int arg = 1;
        String name = switch (arg) {
            case 1 -> "one";
            case 2 -> {
                if (employee != null) {
                    yield "two";
                }
                yield "three";
            }
            default -> "N/A";
        };

    }
}

interface Runner {
    Optional<String> get(int id);

    void run();

    default void run(Duration duration) {
    }

    static void run(int ms) {
    }

    private void runInternal() {

    }
}

record Employee(String name, int age) {
}

//@RequiredArgsConstructor
//@Getter
//class Employee {
//    private final String name;
//
//    private final int age;

//    public Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }


//}
