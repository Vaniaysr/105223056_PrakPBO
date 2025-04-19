package library.model;

public class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberID() {
        return memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberID(String memberId) {
        this.memberId = memberId;
    }
}
