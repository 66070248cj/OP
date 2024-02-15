import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JDesktopPane pane;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1,m2,m3, mi1;
    private JMenuItem mi2,mi3,mi4,ms1,ms2;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI(){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        fr = new JFrame("SubMenultem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        pane = new JDesktopPane();
        pane.setBackground(Color.BLACK);
        
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        frame1.setSize(300, 200);
        frame1.setVisible(true);
        frame2.setSize(300, 200);
        frame2.setVisible(true);
        frame3.setSize(300, 200);
        frame3.setVisible(true);
        pane.add(frame1);
        pane.add(frame2);
        pane.add(frame3);
        
        fr.setJMenuBar(mb);
        mi1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        
        ms1 = new JMenuItem("Window");
        ms2 = new JMenuItem("Message");
        mi1.add(ms1);
        mi1.addSeparator();
        mi1.add(ms2);
        fr.add(pane);
        
        
        
        fr.setSize(1280,920);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
           new MDIFromGUI();
        }
}
