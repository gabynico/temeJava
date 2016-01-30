package homework1;

import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * Created by ns on 1/26/2016.
 */
public class ComputeAllPrimeNumbers {

    public static void main (String[] args) throws java.lang.Exception
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int s =0;
        ArrayList a = new ArrayList();

        for(int i = 0; i <= n; i++){
            a.add("0");
        }

        for(int i = 2; i <= n; i++){
            if(a.get(i) == "0" ){
                for(int j = i + i; j <= n; j += i){
                    a.set(j, "1");
                }
                //System.out.println(i);
                s+=i;
            }

        }
        System.out.println(s);



    }
}
