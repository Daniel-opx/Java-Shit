import VectorPkg.Vector;

public class Matrix {
    private final int rows;
    Vector[] vectors;
    public int GetRowsCount()
    {
        return  this.rows;
    }

    private Matrix(int length)
    {
        vectors = new Vector[length];
        rows = length;

    }

    public Matrix(Vector... vectorsArr)
    {
        this(vectorsArr.length);
        for(int i = 0; i < vectorsArr.length;i++)
        {
            vectors[i] = Vector.InstaciateZeroMatrix(vectorsArr[0].getLength());
            vectors[i].CopyVector(vectorsArr[i]);
        }
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < vectors[0].getLength(); j++)
            {
                sb.append(vectors[i].GetElementAt(j) + "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }




}
