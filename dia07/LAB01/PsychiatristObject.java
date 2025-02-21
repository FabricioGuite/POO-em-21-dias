package dia07.LAB01;

public class PsychiatristObject {

    public static void main(String[] args) {

        PsychiatristObject doutor = new PsychiatristObject();
        SadObject sad = new SadObject();
        HappyObject happy = new HappyObject();

        System.out.println("como o senhor está se sentindo hoje?");
        doutor.examine(happy);

        System.out.println();

        System.out.println("como o senhor está se sentindo hoje?");
        doutor.examine(sad);

        System.out.println();

        doutor.observe(happy);

        System.out.println();

        doutor.observe(sad);        
    }

    public void examine(MoodyObject object){
        System.out.println(object.getMood());
    }

    public void observe(SadObject sad){
        sad.cry();
        System.out.println("O senhor está muito feliz hoje!");
    }

    public void observe(HappyObject happy){
        happy.laugh();
        System.out.println("Tente se alegrar!!!");
        
    }
    
}
