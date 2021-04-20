package labsKPP.entityes;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "results")
public class ResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerId;
    @Column(name = "first", nullable = false)
    private String evenValueAnswer;
    @Column(name = "second", nullable = false)
    private String simpleValueAnswer;

    public ResultEntity() {

    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
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