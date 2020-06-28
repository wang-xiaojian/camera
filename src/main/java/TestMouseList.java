import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TestMouseList extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(200, 200, 1000, 200);//设置窗口的大小 位置
        f.addMouseListener(new MouseListTest());
        f.setVisible(false);//让窗口显示出来
    }
}

class MouseListTest implements MouseListener {
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击事件");
        //System.out.println(e.getClickCount());//和鼠标抬起差不多
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("鼠标抬起");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标进来了");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("鼠标出去了");
    }

}