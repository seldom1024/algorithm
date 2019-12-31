package dynamic;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/12/17 22:39
 */
public class RobotTest {
    public static void main(String[] args) throws AWTException {
        // 创建 Robot 实例
        Robot robot = new Robot();

        // 执行完一个事件后再执行下一个
        robot.setAutoWaitForIdle(true);

        // 移动鼠标到指定屏幕坐标
        robot.mouseMove(1000, 1000);

        // 按下鼠标左键
        robot.mousePress(InputEvent.BUTTON1_MASK);

        // 延时100毫秒
        robot.delay(100);

        // 释放鼠标左键（按下后必须要释放, 一次点击操作包含了按下和释放）
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);

        // 延时100毫秒
        robot.delay(100);

        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
    }
}
