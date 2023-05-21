public class MySoundbox extends Soundbox implements Controler {
  public void execute() {
    int curLevel = getLevel() ;
    if ( curLevel == 0 ) {
      low() ;
    }
    else if ( curLevel == 1 ) {
      medium() ;
    }
    else if ( curLevel == 2 ) {
      high() ;
    }
    else {
      off() ;
    }
  }  
}
