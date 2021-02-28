//N.I.T.Hewage
//IT19220116
//Y3S1_design patterns in class activity 01

class Main {
  public static void main(String[] args) {
    
    RemoteController remoteController = new RemoteController();

    Light livingRoomLight = new LivingRoomLight("Living room light");
    Light kitchenLight = new KitchenLight("Kitchen Light");

    Lightoncommand onLivingRoomLight = new Lightoncommand(livingRoomLight);
    Lightoffcommand offLivingRoomLight = new Lightoffcommand(livingRoomLight);
    remoteController.setCommand(onLivingRoomLight,offLivingRoomLight);
    remoteController.onbuttonPushed();
    remoteController.onbuttonPushed();

    Lightoncommand onKitchenLight = new Lightoncommand(livingRoomLight);
    Lightoffcommand offKitchenLight = new Lightoffcommand(kitchenLight);
    remoteController.setCommand(onKitchenLight,offKitchenLight);
    remoteController.onbuttonPushed();
    remoteController.onbuttonPushed();

  
  }
}