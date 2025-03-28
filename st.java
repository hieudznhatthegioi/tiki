public class st {
    private String name, id, group, email;

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getid() {
        return this.id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getgroup() {
        return this.group;
    }

    public void setgroup(String group) {
        this.group = group;
    }

    public String getemail() {
        return this.email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    String getinfo() {
        st s = new st();
        s.setname("Nguyen Van An");
        s.setid("17020001");
        s.setgroup("K62CC");
        s.setemail("17020001@vnu.edu.vn");
        return s.getemail() + " - " + s.getid() + " - " + s.getgroup() + " - " + s.getemail();
    }

    String getInFo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    st() {
        name = "student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    st(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    st(st s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    st(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public static void main(String[] args) {

    }
}
