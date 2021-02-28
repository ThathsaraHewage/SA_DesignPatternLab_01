public class Lightoffcommand implements Command{
 
  Light light;
   public Lightoffcommand(Light light){
      this.light = light;
  }
 
  public void execute(){
        light.off();
  }
}