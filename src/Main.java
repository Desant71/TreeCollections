import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> noblePeople = new ArrayList<>();
        noblePeople.add(new Person("Nikita", "Filyakin", 29));
        noblePeople.add(new Person("Marfa", "Makarova St Stepanenko", 18));
        noblePeople.add(new Person("Natasha", "Pop Fm St", 4));
        noblePeople.add(new Person("Sasha", "Maza Kaka", 16));

        noblePeople.sort(new WordsInSurname(3));
        System.out.println(noblePeople);
    }
}
