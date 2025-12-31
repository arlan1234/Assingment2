import java.util.Objects;

public class WorkoutPlan {
    private String name;
    private int difficulty;     // 1–5
    private int durationMin;

    public WorkoutPlan(String name, int difficulty, int durationMin) {
        this.name = name;
        this.difficulty = difficulty;
        this.durationMin = durationMin;
    }

    // геттеры
    public String getName() { return name; }
    public int getDifficulty() { return difficulty; }
    public int getDurationMin() { return durationMin; }

    @Override
    public String toString() {
        return name + " (сложность " + difficulty + ", " + durationMin + " мин)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkoutPlan that = (WorkoutPlan) o;
        return difficulty == that.difficulty &&
                durationMin == that.durationMin &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, difficulty, durationMin);
    }
}