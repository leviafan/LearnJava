public class Cell {
    private int X;
    private int Y;
    boolean isEmpty;

    public Cell(int x, int y){
        X = x;
        Y = y;
        isEmpty = true;
    }
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }
    public boolean isEmpty(){
        return isEmpty;
    }
    public String toString(){
        String result = "";
        if (isEmpty){
            result+=String.format("empty Cell at (%d, %d)",X,Y);
        } else{
            result+=String.format("filled Cell at (%d, %d)",X,Y);
        }
        return result;
    }
}
