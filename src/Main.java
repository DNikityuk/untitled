public class Main {
    @Override
    public String toString() {
        return "Я новый метод toSting";
    }
    private int in=0;
    private String getMessage(){
        return "fasdfjkdfj;as";
    }
    private void setIn(int in){
        this.in = in;
    }
    private int getIn(){
        return in;
    }

    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println(new Main().toString());
        System.out.println(new Main().getMessage());
        Main var = new Main();
        var.setIn(8);
        System.out.println(var.getIn());
    }
}
