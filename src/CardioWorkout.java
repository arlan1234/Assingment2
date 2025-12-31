public class CardioWorkout extends WorkoutPlan {
    private boolean isOutdoor;

    public CardioWorkout(String name, int difficulty, int durationMin, boolean isOutdoor) {
        super(name, difficulty, durationMin);
        this.isOutdoor = isOutdoor;
    }

    public boolean isOutdoor() {
        return isOutdoor;
    }

    @Override
    public String toString() {
        return super.toString() + ", на улице: " + (isOutdoor ? "да" : "нет");
    }
}