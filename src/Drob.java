public class Drob {
    private int first;
    private int second;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public Drob(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public long ipart(){
        if (this.second != 0) {
            return this.first / this.second;
        }
        else {
            return 0;
        }
    }
}
