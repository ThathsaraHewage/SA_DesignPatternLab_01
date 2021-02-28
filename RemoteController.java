public class RemoteController{

      Command oncommand;
      Command offcommand;

      public void setCommand(Command oncommand,Command offcommand){
          this.oncommand =oncommand;
          this.offcommand = offcommand;
      }

      public void onbuttonPushed(){
        this.oncommand.execute();
      }

      public void offbuttonPushed(){
        this.offcommand.execute();
      }
}