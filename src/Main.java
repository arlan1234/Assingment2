import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<User> users = new ArrayList<>();

        WorkoutPlan p1 = new StrengthWorkout("Силовая А", 4, 50, 5);
        WorkoutPlan p2 = new CardioWorkout("Беговая", 3, 40, true);
        WorkoutPlan p3 = new StrengthWorkout("Жим лёжа", 5, 60, 6);
        WorkoutPlan p4 = new CardioWorkout("Велосипед", 2, 45, false);

        users.add(new User("Aslan", 24, p1));
        users.add(new User("Dias", 27, p2));
        users.add(new User("Aigerim", 22, p3));
        users.add(new User("Nursultan", 30, p4));
        users.add(new User("Aizhan", 25, p1));

        System.out.println("=== Все пользователи ===");
        for (User u : users) {
            System.out.println(u);
        }

        System.out.print("\nВведите имя для поиска: ");
        String searchName = scanner.nextLine().trim();

        boolean found = false;
        for (User u : users) {
            if (u.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Найден: " + u);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Пользователь с именем " + searchName + " не найден.");
        }

        System.out.println("\n=== Пользователи с высокой сложностью (≥4) ===");
        for (User u : users) {
            if (u.getCurrentPlan().getDifficulty() >= 4) {
                System.out.println(u);
            }
        }

        System.out.println("\n=== Сортировка по убыванию сложности ===");
        users.sort((u1, u2) ->
                Integer.compare(u2.getCurrentPlan().getDifficulty(),
                        u1.getCurrentPlan().getDifficulty())
        );

        for (User u : users) {
            System.out.println(u);
        }

        System.out.println("\n=== Проверка equals() ===");
        User aslan = users.get(0);           // Aslan
        User aizhan = null;
        for (User u : users) {
            if (u.getName().equals("Aizhan")) {
                aizhan = u;
                break;
            }
        }

        if (aslan != null && aizhan != null) {
            System.out.println("Aslan.equals(Aizhan) → " + aslan.equals(aizhan));
        }

        scanner.close();
    }
}