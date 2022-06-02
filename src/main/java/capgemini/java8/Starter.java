package capgemini.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Starter {

    private int count;

    public static void main(String[] args) {
        var items = List.of("1", "2");

        //var elems = Map.of();
        var item = (String) null;

        boolean match = items.stream().peek(System.out::println)
                .anyMatch(s -> s != null);
        System.out.println(match);

        LocalDate date = LocalDate.now();
        LocalDate date1 = date.plusMonths(1);
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
