public class Human implements Competitor {
    private String name;

    private int maxRunDistance;
    private int maxJumpHeigth;
    private int maxSwimDistance;

    private boolean active;

    public Human(String name) {

        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeigth = 7;
        this.maxSwimDistance = 110;
        this.active = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (name + " Done the cross!");
        } else {
            active = false;
            return (name + " Failed cross!");

        }
    }

    @Override
    public String swim(int dist) {
        if (dist <= maxSwimDistance) {
            return (name + " Done swim!");
        } else {
            active = false;
            return (name + " Failed swim!");

        }
    }

    @Override
    public String jump(int height) {
        if (height <= maxJumpHeigth) {
            return (name + " Done height!");
        } else {
            active = false;
            return (name + " Failed height!");
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}