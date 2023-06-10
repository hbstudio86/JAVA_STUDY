import java.awt.*;

public class _000000_230521_Chapter14 {
    public static void main(String[] args){
        Frame f1 = new Frame("Frame1");
        f1.setLayout(new FlowLayout());
        f1.add(new Checkbox("Whisky"));
        f1.add(new Checkbox("beer"));
        List l1 = new List(4, true);
        CheckboxGroup group = new CheckboxGroup();
        f1.add(new Checkbox("Yes",false,group));
        f1.add(new Checkbox("NO",true,group));
        f1.add(l1);
        f1.setSize(800, 800);
        f1.setVisible(true);
        // Button btn1 = new Button("Click");


    }
}
