package homework9;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String  getType() {
        if (this.a == this.b && this.a == this.c){
            return "equilateral";
        }else if(this.a == this.b){
            return "isoscele";
        }else if(this.a == this.c){
            return "isoscele";
        }else if(this.c == this.b) {
            return "isoscele";
        }else{
            return "scalene";
        }
    }
}
