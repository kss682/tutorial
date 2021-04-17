import java.awt.*;
import java.awt.event.*;

public class Layout extends Frame implements ActionListener{
    TextField t1 = new TextField("file link");
    Button b1 = new Button("Start");
    Download dwnld = null;

    Layout(){
        
        t1.setBounds(100, 100, 200, 20);
        add(t1);
        
        b1.setBounds(125, 100, 50, 50);
        b1.addActionListener((ActionListener) this);  
        add(b1);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e){
        if(b1.getLabel().equals("Start")){
            b1.setLabel("Pause");
            dwnld = new Download(t1.getText(), 0, 10000);
            dwnld.download();
        }
        else{
            b1.setLabel("Start");
            dwnld.pause();
            dwnld.checkFileSize();
        }
    }

    public static void main(String[] args){
        new Layout();
    }
}

