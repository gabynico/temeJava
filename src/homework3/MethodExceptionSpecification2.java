package homework3;

public class MethodExceptionSpecification2 implements MethodExceptionSpecification {
    @Override
    public void m(int i, int j) throws ArithmeticException{
        try {
            System.out.println(i / j);
        }catch(Exception e){
            throw e;
        }
    }

    public static void main(String[] args) {
        MethodExceptionSpecification2 s = new MethodExceptionSpecification2();
        try{
        s.m(5, 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
