public class Remote {
    
    Controler [] buttons = new Controler [5] ;  // 5個按鈕
    
    void SetButton( int buttonId, Controler driver ) {
        if ( buttonId < 5 && buttonId >= 0 ) buttons[buttonId] = driver ;
    }

    /**
     * 當有某個按鈕被按的時候會呼叫這個方法，
     * 必須執行對應的裝置
     * @param buttonId 紀錄哪個button被按
     */
    void buttonClicked( int buttonId ) {
        if ( buttons[buttonId] instanceof Controler) buttons[buttonId].execute() ;
    }
    
    /**
     * 直接啟動所有的裝置(意即，每個裝置的按鈕都按一下)
     */
    void pressAllButtons() {
        for ( int i = 0; i < buttons.length; i++ ) {
            buttonClicked(i) ;
        }
    }
}