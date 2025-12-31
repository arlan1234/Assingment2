public class StrengthWorkout extends WorkoutPlan {
    private int setsCount;

    public StrengthWorkout(String name, int difficulty, int durationMin, int setsCount) {
        super(name, difficulty, durationMin);
        this.setsCount = setsCount;
    }

    public int getSetsCount() {
        return setsCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", подходов: " + setsCount;
    }
}