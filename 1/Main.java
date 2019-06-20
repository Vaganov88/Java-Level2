public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(80), new Wall(5), new Water(100)); // Creating obstacle course
        Team team = new Team("DreamTeam", new Human("BobSquarePants"), new Cat("Basik"), new Dog("Lucky"), new Human("MishGun")); // Creating team
        c.doIt(team); // Ask team to pass thru obstacle course
        team.showResults(); // Showing results
    }
}