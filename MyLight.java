public class MyLight extends Light implements Controler {
  public void execute() {
    if ( getBrightness() == 0 ) {
      dim() ;
    }
    else if ( getBrightness() == 1 ) {
      bright() ;
    }
    else {
      off() ;
    }
  }
}
