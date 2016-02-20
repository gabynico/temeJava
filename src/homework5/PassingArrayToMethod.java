package homework5;

public class PassingArrayToMethod {

    public void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print( arr[i]);
        }

//        for (int x : arr) {
//            System.out.print(x);
//        }
        System.out.println();
    }

    public static void main(String[] args) {
        PassingArrayToMethod m = new PassingArrayToMethod();
        int[] a = {1,2,3,4};
        m.printArray(a);

        int[] b = {5,6,7,8,9,10};
        m.printArray(b);

    }
}

