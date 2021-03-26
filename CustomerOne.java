public class CustomerOne extends Customer {
    private  int score;
    private String location;


    public CustomerOne() {
    }

    public CustomerOne(int score, String location) {
        this.score = score;
        this.location = location;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            " age='" + getAge() + "'" +
            " score='" + getScore() + "'" +
            ", location='" + getLocation() + "'" +
            "}";
    }

    
}
