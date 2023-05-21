public class MyTelevision extends Television implements Controler {
  public void execute() {
    if ( getStatus() ) {
      off() ;
    } // if 
    else {
      on() ;
    } // else
  } // execute()
} // MyTelevision
