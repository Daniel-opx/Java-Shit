package VectorPkg;

public class Matrix {
    private final int rows;
    private  Vector[] vectors;
    private int numOfCols;
    public int GetRowsCount()
    {
        return  this.rows;
    }

    private Matrix(int length)
    {
        vectors = new Vector[length];
        rows = length;

    }

    /**
     *
     * @param vectorsArr  array of object of type Vetor, all must be in the same length
     */
    public Matrix(Vector... vectorsArr)
    {
        this(vectorsArr.length);
        for(int i = 0; i < vectorsArr.length - 1; i++)
        {
            if(vectorsArr[i].getLength() != vectorsArr[i + 1].getLength())
                return;
        }
        this.numOfCols = vectorsArr[0].getLength();
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
    public void AddMatrix(Matrix other)
    {
        if(this.vectors.length != other.vectors.length || this.vectors[0].getLength() != other.vectors[0].getLength())
            return;
        for (int i = 0; i < this.vectors.length; i++) {
            this.vectors[i].AddVector(other.vectors[i]);
        }
    }




}
