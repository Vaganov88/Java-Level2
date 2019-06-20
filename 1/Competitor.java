public interface Competitor {
    String run(int dist);

    String swim(int dist);

    String jump(int height);

    boolean isOnDistance();

    void info();
}
