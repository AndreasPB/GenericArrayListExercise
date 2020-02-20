public class Hanne {
    private String son1;
    private String son2;
    private int powerLevel;

    public Hanne(String son1, String son2) {
        this.son1 = son1;
        this.son2 = son2;
        this.powerLevel = 9001;
    }

    @Override
    public String toString() {
        return "Hanne{" +
                "son1='" + son1 + '\'' +
                ", son2='" + son2 + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }
}