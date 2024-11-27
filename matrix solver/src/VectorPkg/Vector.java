package VectorPkg;

public class Vector {
    double[] vector;
    private final int vectorLength;

    public int getLength()
    {
        return this.vectorLength;
    }

    private Vector(int length)
    {
        vector = new double[length];
        vectorLength = vector.length;
    }
    public Vector(double[] numbers)
    {
        this(numbers.length);
        for(int i = 0; i < numbers.length;i++)
        {
            this.vector[i] = numbers[i];
        }
    }
    public static Vector InstaciateZeroMatrix(int length)
    {
        Vector v = new Vector(length);
        for(int i = 0; i < length; i++)
        {
            v.vector[i] = 0;
        }
        return v;
    }



    public Double GetElementAt(int idx)
    {
        try
        {
            return this.vector[idx];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + "index is out of bound");
        }
        return null;
    }


@Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < this.getLength(); i++)
       {
           sb.append((this.vector[i] + "   "));
       }
       return sb.toString();
    }

    public void MultiplyByScalar(double scalar)
    {
        IVectorToVectorAction ScalarMultiplier = new IVectorToVectorAction() {
            @Override
            public void DoActionTo(Vector src, Vector dst, int idx) {
                dst.vector[idx] *= scalar;
            }
        };
        Transform(this, ScalarMultiplier);
    }



    public void AddVector(Vector other)
    {
       IVectorToVectorAction Adder = new IVectorToVectorAction() {
           @Override
           public void DoActionTo(Vector src, Vector dst,int idx) {
               dst.vector[idx] += src.vector[idx];
           }
       };
       Transform(other,Adder);
    }
    public void CopyVector(Vector other)
    {
        IVectorToVectorAction Copier = new IVectorToVectorAction() {
            @Override
            public void DoActionTo(Vector src, Vector dst,int idx) {
                dst.vector[idx] = src.vector[idx];
            }
        };
        Transform(other,Copier);

    }

    private void Transform(Vector src,IVectorToVectorAction action)
    {
        if(this.getLength() != src.getLength())
            return;
        for(int i = 0; i < src.getLength(); i++)
        {
            action.DoActionTo(src,this,i);
        }
    }


}
