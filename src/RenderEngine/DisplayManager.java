package RenderEngine;

/**************************************
 *  Copyright (c) 2019 Kyler Swanson
 *  All rights reserved.
 **************************************/

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;

/**
 * DisplayManager class header
 *
 * @author Kyler Swanson
 * @version 1.0
 */
public class DisplayManager {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int FPS_CAP = 120;
    public static final String TITLE = "Game Display";

    public static void createDisplay() {

        ContextAttribs attribs = new ContextAttribs(3, 2);
        attribs.withForwardCompatible(true);
        attribs.withProfileCore(true);

        try {
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.create(new PixelFormat(), attribs);
            Display.setTitle(TITLE);
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        GL11.glViewport(0, 0, WIDTH, HEIGHT);

    }

    public static void updateDisplay() {

        Display.sync(FPS_CAP);
        Display.update();

    }

    public static void closeDisplay() {
        Display.destroy();
    }

}
