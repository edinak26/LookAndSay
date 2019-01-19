import application.control.Controller;
import application.model.Model;
import application.view.View;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Model model=new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.run();
    }
}
