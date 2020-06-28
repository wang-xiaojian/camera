import org.junit.Test;

import java.awt.*;

public class MouseMovedExampleEvent extends java.util.EventObject {
    protected static int x, y;

    /*　创建一个鼠标移动事件MouseMovedExampleEvent */
    MouseMovedExampleEvent(java.awt.Component source, Point location) {
        super(source);
        x = location.x;
        y = location.y;
    }

    /* 获取鼠标位置*/
    public Point getLocation() {
        return new Point(x, y);
    }

    public static void main(String[] args) {
        Point point = new Point(x, y);
    }

}