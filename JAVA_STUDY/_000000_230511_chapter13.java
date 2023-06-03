import java.awt.*;
class MyFrame extends Frame{
    public MyFrame(String title){
        super(title);
        this.setSize(400,300);
        this.setVisible(true);
    }

    public void paint(Graphics g){
        g.drawString("Hello AWT",150,150);
    }
}

public class _000000_230511_chapter13 {
    public static void main(String[] args){
        MyFrame myFrame = new MyFrame("Hello AWT");
        
        Frame f = new Frame("Pulldown Meny");
        
        MenuBar mb = new MenuBar();
        Menu m = new Menu("Menu1");
        m.add(new MenuItem("MenuItem1"));
        Menu sm = new Menu("SubMenu");
        sm.add(new MenuItem("SubMenu1"));
        m.add(sm);
        m.add(new MenuItem("MenuItem2"));
        mb.add(m);

        f.setMenuBar(mb);
        f.setSize(600,600);
        f.setBackground(Color.white);
        f.setVisible(true);
    }
}
