### OOP ASSIGNMENT 3
##### Update Date: 2023/ 5/ 26
因為Light、Television、Soundbox是不可更動的類別，所以當使用者購買後即產生MyLight、MyTelevision、MySoundbox，並繼承原本的類別。除此之外，為了能用遙控器去控制，所以每個家電都會需要有接收遙控器訊號的功能，於是實做了Controler，並規範遙控器該如何控制此家電

---
### Controler
為`public interface`，用來使家電接受遙控器訊號

### Remote

**Controler [] buttons**
新增5個按鈕，並且能與Controler對接
```java
Controler [] buttons = new Controler [5];
```

**buttonClicked**
`buttonClicked`用來接收點下的按鈕id，並執行相應連接到的家電，假如此按鈕未連接，按了不會有任何反應
```java
void buttonClicked( int buttonId ) {
  if ( buttons[buttonId] instanceof Controler) buttons[buttonId].execute() ;
}
```

**SetButton**
用來設定家電要與哪個按鈕連接
```java
void SetButton( int buttonId, Controler driver ) {
  if ( buttonId < 5 && buttonId >= 0 ) buttons[buttonId] = driver ;
}
```