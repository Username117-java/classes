public class App {
    public static void main(String[] args) {
        Author kirBulychev = new Author("Кир", "Булычёв");
        Author isaacAsimov = new Author("Айзек", "Азимов");
        Book oneHundredYearsAhead = new Book("Сто лет тому вперёд", kirBulychev, 1978);
        Book iRobot = new Book("Я, робот", isaacAsimov, 1950);

        iRobot.setYearOfPublication(2000);
        System.out.println(iRobot.getYearOfPublication());
        System.out.println(oneHundredYearsAhead);
        System.out.println(isaacAsimov);
        System.out.println(oneHundredYearsAhead.hashCode());
        System.out.println(isaacAsimov.hashCode());

    }
}
