package application.model;

import java.util.ArrayList;

public class Model {
    String startValue;
    ArrayList<Character> currentValue;
    public static final int MAX_GENERATE_NUM = 20;

    public Model() {

    }

    public void setStartValue(String startValue) {
        this.startValue = startValue;

        currentValue = new ArrayList<>();
        for(int i=0;i<startValue.length();i++){
            currentValue.add(startValue.charAt(i));
        }
    }

    public void generateNextValue() {
        ArrayList<Character>newValue = new ArrayList<>();
        int counter=0;
        for(int i=0;i<currentValue.size();i++){
            if(!isNextSame(i)){
                counter++;
                newValue.add(Integer.toString(counter).charAt(0));
                counter=0;
                newValue.add(currentValue.get(i));
            }
            else{
                counter++;
            }
        }
        currentValue=newValue;
    }
    public boolean isNextSame(int index){
        if(index+1>=currentValue.size())
            return false;
        return currentValue.get(index)==currentValue.get(index+1);
    }
    public ArrayList<Character> getCurrentValue(){
        return currentValue;
    }
}
