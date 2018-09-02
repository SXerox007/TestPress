import java.util.ArrayList;
class Model{
    private int key;
    private ArrayList<Integer> val;
    
    public void setKey(int key){
        this.key=key;
    }
    
    public void setValue(ArrayList<Integer> val){
        this.val = val;
    }
    
    public int getKey(){
        return key;
    }
    
    public ArrayList<Integer> getVal(){
        return val;
    }
}
