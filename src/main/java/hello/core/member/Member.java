package hello.core.member;

public class Member {
    private Long i;
    private String name;
    private Grade grade;

    //생성자
    public Member(Long i, String name, Grade grade) {
        this.i = i;
        this.name = name;
        this.grade = grade;
    }

    //Getter and Setter
    public Long getId() {
        return i;
    }

    public void setId(Long i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    //////////////////////GETTER AND SETTER//////////////////////////

}
