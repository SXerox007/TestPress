import java.util.Scanner;
import java.math.*;
import java.util.*;
import java.util.ArrayList;
public class MaximumNumber{
    private Scanner sc=new Scanner(System.in);
    private int n;
    private ArrayList<Model> values;
    
    MaximumNumber(){
        System.out.println("Enter the array size.");
        n = sc.nextInt();
        values = new ArrayList<>(9);
        init();
        for(int i=0;i<n;i++){
            logicBuilder(sc.nextInt());
        }
    }
    private void init(){
        for(int i=0;i<9;i++){
        ArrayList<Integer> temp = new ArrayList<>();
        Model model = new Model();
        model.setKey(0);
        model.setValue(temp);
        values.add(model);
        }
    }
    
    private void printLagestNumberOfCombination(){
        System.out.println("Maximum Possible Number");
        for(int i=8;i>=0;i--){
            if(values.get(i).getVal().size()!=0){
                for(int j=0;j<values.get(i).getVal().size();j++){
                    System.out.print(values.get(i).getVal().get(j));
                }
            }
        }
    }
    
    private void logicBuilder(int digit){
        insertElementInSortedOrder(finderFirstDigit(digit),digit);
    }
    
    
    private void insertElementInSortedOrder(int position,int digit){
        Model model = new Model();
        model.setKey(position);
        try{
         model.setValue(setValueOfModel(values.get(position-1).getVal(),digit));
        }catch(Exception e){
            ArrayList<Integer> temp = new ArrayList<>();
            model.setValue(setValueOfModel(temp,digit));
        }
         values.set(position-1,model);
    }
    
    private ArrayList<Integer> setValueOfModel(ArrayList<Integer> currentPositionArrayList,int digit){
        if(currentPositionArrayList.size()==0){
            currentPositionArrayList.add(digit);
            return currentPositionArrayList;
        }
        else{
            return setValueInSortedOrder(currentPositionArrayList,digit);
        }
    }
    
    private ArrayList<Integer> setValueInSortedOrder(ArrayList<Integer> currentPositionArrayList,int digit){
        boolean flag=true;
        for(int i=0;i<currentPositionArrayList.size();i++){
             if (currentPositionArrayList.get(i) > digit) continue;
            currentPositionArrayList.add(i,digit);
            flag=false;
            break;
        }
        if(flag)
        currentPositionArrayList.add(digit);
        return currentPositionArrayList;
    }
    
    
    private int finderFirstDigit(int n)
    {
        int digits = (int)(Math.log10(n));
        n = (int)(n / (int)(Math.pow(10, digits)));
        return n;
    }
    
    public static void main(String args[]){
        MaximumNumber maximumNumber = new MaximumNumber();
        maximumNumber.printLagestNumberOfCombination();
    }
}

