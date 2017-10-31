public class Wall extends Cell{
    private int X;
    private int Y;
    private boolean isEmpty;
    public Wall (int x, int y){
        super(x, y);
        isEmpty=false;
    }

    public boolean isEmpty(){
        return false;
    }

    public String toString(){
        String result = "";
            result+=String.format("Wall at (%d, %d)",X,Y);
        return result;
    }

    public Cell destroy(){
        return new Cell(X, Y);
    }
}
