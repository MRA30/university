public class Subject {

    private String name;

    private String major;

    private Integer points;

    public Subject(String name, String major, Integer points) {
        this.name = name;
        this.major = major;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

}
