/*
 * Created by JFormDesigner on Mon May 24 18:46:19 CST 2021
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.alldo.MemberDO;
/**
 * @author MudongGuo
 */
public class Main_Menu extends JFrame {

    MemberDO m;

    public Main_Menu(MemberDO m) {
        initComponents();
        frame1.setVisible(true);
        this.m = m;
        panel1.add(new JTextArea(m.getInfo())); //需要改成已经预约的课程
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        if(this.m.getType()=="SVIP"){
            frame1.setVisible(false);
            new Reservation(this.m);
            frame1.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Insufficient privileges!"+"\n"+"Please upgrade to SVIP in profile page!");
        }
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new User_Video_Play(this.m);
        frame1.dispose();
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new Information(this.m);
        frame1.dispose();
    }

    private void button5MouseClicked(MouseEvent e) {
        // TODO add your code here
        frame1.setVisible(false);
        new UserLogin();
        frame1.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - MudongGuo
        frame1 = new JFrame();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        panel1 = new JPanel();

        //======== frame1 ========
        {
            frame1.setUndecorated(true);
            frame1.setFont(new Font(Font.DIALOG, Font.ITALIC, 32));
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(null);

            //---- button2 ----
            button2.setText("Reservation");
            button2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button2.getFont().getStyle(), button2.getFont().getSize() + 8));
            button2.setBackground(new Color(204, 204, 255));
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
            });
            frame1ContentPane.add(button2);
            button2.setBounds(40, 110, 150, 50);

            //---- button3 ----
            button3.setText("Video play");
            button3.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button3.getFont().getStyle(), button3.getFont().getSize() + 8));
            button3.setBackground(new Color(204, 204, 255));
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
            });
            frame1ContentPane.add(button3);
            button3.setBounds(40, 180, 150, 50);

            //---- button4 ----
            button4.setText("Profile");
            button4.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button4.getFont().getStyle(), button4.getFont().getSize() + 8));
            button4.setBackground(new Color(204, 204, 255));
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
            });
            frame1ContentPane.add(button4);
            button4.setBounds(40, 250, 150, 50);

            //---- button5 ----
            button5.setText("Log out");
            button5.setFont(new Font("\u65b9\u6b63\u8212\u4f53", button5.getFont().getStyle(), button5.getFont().getSize() + 8));
            button5.setBackground(new Color(204, 204, 255));
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
            });
            frame1ContentPane.add(button5);
            button5.setBounds(40, 320, 150, 50);

            //---- label1 ----
            label1.setText("Home Page");
            label1.setInheritsPopupMenu(false);
            label1.setForeground(Color.white);
            label1.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5));
            frame1ContentPane.add(label1);
            label1.setBounds(45, 25, 115, 70);

            //---- label2 ----
            label2.setText("Schedule");
            label2.setFont(new Font("\u65b9\u6b63\u8212\u4f53", label2.getFont().getStyle(), label2.getFont().getSize() + 5));
            frame1ContentPane.add(label2);
            label2.setBounds(305, 25, 115, 70);

            //======== panel1 ========
            {
                panel1.setBackground(new Color(204, 204, 255));
                panel1.setBorder ( new CompoundBorder ( new TitledBorder ( new EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , TitledBorder
                . CENTER , TitledBorder . BOTTOM, new Font ( "D\u0069al\u006fg", Font. BOLD ,12 ) , Color .red ) ,panel1. getBorder () ) )
                ; panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
                ) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
                ;
                panel1.setLayout(null);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            frame1ContentPane.add(panel1);
            panel1.setBounds(305, 110, 345, 265);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < frame1ContentPane.getComponentCount(); i++) {
                    Rectangle bounds = frame1ContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = frame1ContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                frame1ContentPane.setMinimumSize(preferredSize);
                frame1ContentPane.setPreferredSize(preferredSize);
            }
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - MudongGuo
    private JFrame frame1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}