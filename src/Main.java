import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> noblePeople = new ArrayList<>();
        noblePeople.add(new Person("Nikita", "Filyakin", 29));
        noblePeople.add(new Person("Marfa", "Makarova St Stepanenko", 18));
        noblePeople.add(new Person("Natasha", "Pop Fm St", 54));
        noblePeople.add(new Person("Sasha", "Maza Kaka", 26));


        noblePeople.sort((n1, n2) -> {
            String[] ar1 = n1.getSurname().split(" ");
            String[] ar2 = n2.getSurname().split(" ");

            int firstLength = ar1.length;
            int secondLength = ar2.length;

            if (firstLength < secondLength) {
                return -1;
            }
            if (firstLength > secondLength) {
                return 1;
            }
            return n1.getAge() - n2.getAge();
        });
        noblePeople.forEach(System.out::println);
    }
}

