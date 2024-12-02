public class Main {
  public static void main(String[] args) {
    Model model = new Model();
    View view = new View();

    Controllor controllor = new Controllor(model, view);

    controllor.setData("MVC Model");
    controllor.updateView();
  }
}
