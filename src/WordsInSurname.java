import java.util.Comparator;

public class WordsInSurname implements Comparator<Person> {
    protected int maxSurnameWords;
    protected int firstLength;
    protected int secondLength;

    public WordsInSurname(int maxSurnameWords) {
        this.maxSurnameWords = maxSurnameWords;
    }

    @Override
    public int compare(Person n1, Person n2) {
        String[] ar1 = n1.getSurname().split(" ");
        String[] ar2 = n2.getSurname().split(" ");

        firstLength = ar1.length;
        secondLength = ar2.length;

        if (ar1.length > maxSurnameWords) {
            firstLength = maxSurnameWords;
        }

        if (ar2.length > maxSurnameWords) {
            secondLength = maxSurnameWords;
        }

        if (firstLength == secondLength) {
            return n1.getAge() - n2.getAge();
        } else {
            return firstLength - secondLength;
        }
    }
}