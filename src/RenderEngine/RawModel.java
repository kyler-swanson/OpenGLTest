package RenderEngine;

/**************************************
 *  Copyright (c) 2019 Kyler Swanson
 *  All rights reserved.
 **************************************/

/**
 * RawModel class header
 *
 * @author Kyler Swanson
 * @version 1.0
 */
public class RawModel {

    private int vaoID;
    private int vertexCount;

    public RawModel (int vaoID, int vertexCount) {
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;
    }

    public int getVaoID() {
        return vaoID;
    }

    public int getVertexCount() {
        return vertexCount;
    }
}
