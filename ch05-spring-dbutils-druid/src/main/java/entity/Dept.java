package entity;

/**
 * @author 南八
 */
public class Dept {
    private Integer id;
    private String deptname;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                '}';
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
