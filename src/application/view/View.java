package application.view;

import java.util.ArrayList;
import java.util.Scanner;

public class View implements ViewMessages{
    public View(){

    }
    public String getStartValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ENTER_STARTING_NUMBER_MESSAGE);
        String startingNumber = scanner.next();
        scanner.close();
        return startingNumber;
    }
    public void printValue(ArrayList value){
        for(int i=0;i<value.size();i++){
            System.out.print(value.get(i));
        }
        System.out.println();
    }
}
