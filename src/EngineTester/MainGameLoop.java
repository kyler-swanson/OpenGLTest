package EngineTester;

/**************************************
 *  Copyright (c) 2019 Kyler Swanson
 *  All rights reserved.
 **************************************/

import RenderEngine.DisplayManager;
import RenderEngine.Loader;
import RenderEngine.RawModel;
import RenderEngine.Renderer;
import org.lwjgl.opengl.Display;

/**
 * MainGameLoop class header
 *
 * @author Kyler Swanson
 * @version 1.0
 */
public class MainGameLoop {

    public static void main(String[] args) {

        DisplayManager.createDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();

        float[] vertices = {
            -0.5f, 0.5f, 0f,
            -0.5f, -0.5f, 0f,
            0.5f, -0.5f, 0f,
            0.5f, -0.5f, 0f,
            0.5f, 0.5f, 0f,
            -0.5f, 0.5f, 0f
        };

        RawModel model = loader.loadtoVAO(vertices);

        while (!Display.isCloseRequested()) {
            renderer.prepare();

            // TODO: Game logic

            // TODO: Render
            renderer.render(model);

            DisplayManager.updateDisplay();
        }

        loader.cleanUp();

        DisplayManager.closeDisplay();

    }

}
