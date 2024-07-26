package Library;

public class Member {

    int id;
    int memberId;
    String name;
    String address;

    public Member() {
    }

    public Member(int id, int memberId, String name, String address) {
        this.id = id;
        this.memberId = memberId;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", memberId=" + memberId + ", name=" + name + ", address=" + address + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
