public class TestRemote {
    
    public static void main(String[] args) {      
        
        Remote r = // 產生遙控器，可能還需要綁定設備
        
        //在此假設第零個按鈕是綁定電視
        r.buttonClicked(0); // 按下第零個按鈕
        r.buttonClicked(0); // 按下第零個按鈕(第二次)
        r.buttonClicked(0); // 按下第零個按鈕(第三次)
    }
}