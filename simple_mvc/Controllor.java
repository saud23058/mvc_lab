public class Controllor {
  private Model model;
  private View view;

  public Controllor(Model model, View view) {
    this.model = model;
    this.view = view;
  }


  public void setData(String data) {
    this.model.setData(data);
  }

  public String getData() {
    return model.getData();
  }

  public void updateView() {
    view.printData(getData()); 
  }
}
