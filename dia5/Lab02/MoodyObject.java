public abstract class MoodyObject {
    
    // Retorna o humor
    protected abstract String getMood();

    // Pergunta ao objeto como ele se sente
    public void queryMood() {
        System.out.println("I feel " + getMood() + " today!");
    }
}
