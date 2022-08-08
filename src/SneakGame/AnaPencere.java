package SneakGame;

import javax.swing.*;

public class AnaPencere extends JFrame {

    private int mGenislik = 600;
    private int mYukseklik = 600;

    AnaPencere(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//acilan pencere kapandiginda,prgrm kapanir
        setBounds(0,0,mGenislik,mYukseklik);
        setResizable(false); // ekranin buyuklugu degistirilemez
    }

}
