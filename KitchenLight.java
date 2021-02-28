public class KitchenLight implements Light{
  
  String light;
  
  public KitchenLight(String light){
    this.light= light;
  }

  public void on(){
    System.out.println("Turn on " + light);
  }
  public void off(){
    System.out.println("Turn off " + light);
  }
  
}