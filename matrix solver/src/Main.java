//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import VectorPkg.Matrix;
import VectorPkg.Vector;

public class Main {
    public static void main(String[] args) {
       Vector v = new Vector(new double[]{1,2,3,66,5});
       Vector v2 = new Vector(new double[]{1,2,3,4,5});
       Matrix m = new Matrix(v,v2);
       m.AddMatrix(new Matrix(
               new Vector[]
                       {new Vector(new double[]{1,1,1,1,1,}),
                       new Vector(new double[]{1,1,1,1,1})}));
       System.out.println(m);





                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
    
    static int Add(int... nums)
    {
        int sum = 0;
        for(int n:nums)
        {
            sum += n;
        }
        return sum;
    }

}