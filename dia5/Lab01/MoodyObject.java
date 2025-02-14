public class MoodyObject {
    
    // Retorna o humor
    protected String getMood() {
        return "moody";
    }

    // Pergunta ao objeto como ele se sente
    public void queryMood() {
        System.out.println("I feel " + getMood() + " today!");
    }
}
