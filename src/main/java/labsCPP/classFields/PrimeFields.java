package labsKPP.classFields;

public class PrimeFields {
    private int value;
    private String evenValueAnswer;
    private String simpleValueAnswer;

    public PrimeFields(int value, String evenValueAnswer, String simpleValueAnswer) {
        this.value = value;
        this.evenValueAnswer = evenValueAnswer;
        this.simpleValueAnswer = simpleValueAnswer;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getEvenValueAnswer() {
        return evenValueAnswer;
    }

    public void setEvenValueAnswer(String evenValueAnswer) {
        this.evenValueAnswer = evenValueAnswer;
    }

    public String getSimpleValueAnswer() {
        return simpleValueAnswer;
    }

    public void setSimpleValueAnswer(String simpleValueAnswer) {
        this.simpleValueAnswer = simpleValueAnswer;
    }
}
