package dia07.LAB01;

public class HappyObject extends MoodyObject{

    @Override
    protected String getMood() {
        return "Happy";
    }

    public void laugh(){
        System.out.println("hahaha HAHAHAHHAHAHAH HEHEHEHEHE");
    }

}
