public class Main {
    @Override
    public String toString() {
        return "Я новый метод toSting";
    }
    private int in=0;
    String getMessage(){
        return "fasdfjkdfj;as";
    }
    void setIn(int in){
        this.in = in;
    }
    int getIn(){
        return in;
    }

    public static void main(String[] args){
        System.out.println("Hello");
        System.out.print(new Main().toString());
        System.out.print(new Main().getMessage());
        System.out.print(new Main().getIn());
    }
}
