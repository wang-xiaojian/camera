import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;

public class MouseInfo extends JFrame {

    private final JPanel contentPanel = new JPanel();
    JLabel value_x = null;
    JLabel value_y = null;

    static Map<String,String> map =new HashMap<String,String>();
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
//            final MouseInfo info_frame = new MouseInfo();
//            info_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            info_frame.setVisible(true);
//            info_frame.setAlwaysOnTop(true);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Point point = java.awt.MouseInfo.getPointerInfo().getLocation();
                    int x = point.x;
                    int y = point.y;
                    String newPoint = x+""+y;
                    String oldPoint = map.get("point");
                    if (newPoint.equals(oldPoint)){
                        System.out.println("坐标相同");
                    }else {
                        System.out.println("坐标不相同");
                        map.put("point",newPoint);
                    }

                     System.out.println("Location:x=" + point.x + ", y=" + point.y);
//                    info_frame.value_x.setText("" + point.x);
//                    info_frame.value_y.setText("" + point.y);
                }
            }, 100, 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public MouseInfo() {
        setTitle("鼠标坐标获取器");
        setBounds(100, 100, 217, 156);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel lblx = new JLabel("坐标x:");
        lblx.setFont(new Font("宋体", Font.PLAIN, 15));
        lblx.setBounds(22, 27, 66, 31);
        contentPanel.add(lblx);

        JLabel lbly = new JLabel("坐标y:");
        lbly.setFont(new Font("宋体", Font.PLAIN, 15));
        lbly.setBounds(22, 68, 66, 31);
        contentPanel.add(lbly);

        value_x = new JLabel("0");
        value_x.setForeground(Color.BLUE);
        value_x.setFont(new Font("宋体", Font.PLAIN, 20));
        value_x.setBounds(82, 27, 66, 31);
        contentPanel.add(value_x);

        value_y = new JLabel("0");
        value_y.setForeground(Color.BLUE);
        value_y.setFont(new Font("宋体", Font.PLAIN, 20));
        value_y.setBounds(82, 68, 66, 31);
        contentPanel.add(value_y);
    }
}