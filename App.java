public class App {
    public static void main(String[] args) {
     
        HoneyBee queen = new Queen();
        HoneyBee worker = new Worker();
        HoneyBee drone = new Drone();



        ausgabe(queen.doYourJob());
        ausgabe(worker.doYourJob());
        ausgabe(drone.doYourJob());

        ausgabe("----------------");

        ausgabe(queen.fly());
        ausgabe(worker.fly());
        ausgabe(drone.fly());

        ausgabe("----------------");

        Bird bird = new Bird();
        ausgabe(bird.fly());
        ausgabe(bird.hasFeathers());


    }

    private static void ausgabe(String outStr){
        System.out.println(outStr);
    }

}
