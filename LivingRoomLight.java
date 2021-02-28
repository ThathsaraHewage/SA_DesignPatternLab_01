public class LivingRoomLight implements Light{
  
  String light;
  public LivingRoomLight(String light){
    this.light= light;
  }


  public void on(){
    System.out.println("Turn on " + light);
  }
  public void off(){
    System.out.println("Turn off " + light);
  }
  
}