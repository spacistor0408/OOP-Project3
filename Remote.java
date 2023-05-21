public class Remote {
    
    Controler [] buttons = new Controler [5];  // 5個按鈕，實際上不應該設定成Object class，這邊是示範
    
    void SetButton( int buttonId, Controler driver ) {
        buttons[buttonId] = driver ;
    }

    /**
     * 當有某個按鈕被按的時候會呼叫這個方法，
     * 必須執行對應的裝置
     * @param buttonId 紀錄哪個button被按
     */
    void buttonClicked( int buttonId ) {
        buttons[buttonId].execute() ;
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