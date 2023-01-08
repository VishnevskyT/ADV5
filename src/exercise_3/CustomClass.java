package exercise_3;

public class CustomClass {

    boolean isTrue;
    protected final String overview;
    private final transient long key;

    public CustomClass(boolean isTrue, String overview, long key) {
        this.isTrue = isTrue;
        this.overview = overview;
        this.key = key;
    }

    public CustomClass(String overview, long key) {
        this.overview = overview;
        this.key = key;
    }

    public CustomClass(boolean isTrue, String overview) {
        this.isTrue = isTrue;
        this.overview = overview;
        key = 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void myMethod() {
        System.out.println("Hello, fella!");
    }
}
