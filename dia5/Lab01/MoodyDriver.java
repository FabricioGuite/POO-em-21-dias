public class MoodyDriver {
    public static final void main(String[] args) {
        MoodyObject moodyObject = new MoodyObject();
        SadObject sadObject = new SadObject();
        HappyObject happyObject = new HappyObject();

        System.out.println("How does the moody object feel today?");
        moodyObject.queryMood();
        System.out.println();

        System.out.println("How does the sad object feel today?");
        sadObject.queryMood(); // Note que a sobreposição muda o humor
        sadObject.cry();
        System.out.println();

        // Herança: hora de escrever algum código
        System.out.println("How does the happy object feel today?");
        happyObject.queryMood(); // Note que a sobreposição muda o humor
        happyObject.laugh();
        System.out.println();
    }
}
