package application.control;

import application.model.Model;
import application.view.View;

import java.util.ArrayList;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        setStartValue();
        generateValues();
    }

    private void setStartValue() {
        String startValue = view.getStartValue();
        model.setStartValue(startValue);
    }

    private void generateValues() {
        for (int i = 0; i < Model.MAX_GENERATE_NUM; i++) {
            model.generateNextValue();
            ArrayList currentValue = model.getCurrentValue();
            view.printValue(currentValue);
        }
    }
}
