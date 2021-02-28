public class Lightoncommand implements Command{
 
  Light light;
   public Lightoncommand(Light light){
      this.light = light;
  }
 
  public void execute(){
        light.on();
  }
}