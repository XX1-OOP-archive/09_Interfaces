public class Bird extends HoneyBee{

    @Override
    public String fly() {
        return "I'm a bird, I can also fly!";
    }

    @Override
    public String doYourJob() {
        // das ist ein Bienenverhalten !!!
        return "Ich bin eigentlich KEINE Biene!";
    }


    
}
