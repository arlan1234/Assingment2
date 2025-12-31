import java.util.Objects;

public class User {
    private String name;
    private int age;
    private WorkoutPlan currentPlan;

    public User(String name, int age, WorkoutPlan currentPlan) {
        this.name = name;
        this.age = age;
        this.currentPlan = currentPlan;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public WorkoutPlan getCurrentPlan() { return currentPlan; }

    public void setCurrentPlan(WorkoutPlan plan) {
        this.currentPlan = plan;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет) → " + currentPlan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(currentPlan, user.currentPlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, currentPlan);
    }
}