import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Dimension;
import java.awt.Font;

class calculator{
	public static void main(String[] args){
		Frame f = new Frame("Calculator");
		TextField t = new TextField();
        BorderLayout borderLayout = new BorderLayout();
        Panel panel = new Panel();
        GridLayout gridLayout = new GridLayout(4, 4);
        Button[][] buttons = new Button[4][4];
        String[][] buttonNames = {{"7", "8", "9", "/"}, {"4", "5", "6", "*"}, {"1", "2", "3", "-"}, {"0", ".", "=", "+"}};
        Font largerFont = new Font("SansSerif", Font.BOLD, 16);
        
		f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(borderLayout);
        // t.setBounds(0, 0, f.getWidth(), 50);
        f.add(t, BorderLayout.NORTH);
        t.setPreferredSize(new Dimension(f.getWidth(), 60));

        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        panel.setLayout(gridLayout);

        for (int i = 0; i < 4; i++) 
            for(int j = 0; j < 4; j++){
                buttons[i][j] = new Button(buttonNames[i][j]);
                buttons[i][j].setFont(largerFont);
                panel.add(buttons[i][j]);
            }
        
        f.add(panel, BorderLayout.CENTER);
	}
}