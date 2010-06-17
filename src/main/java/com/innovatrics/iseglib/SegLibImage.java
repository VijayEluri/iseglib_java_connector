package com.innovatrics.iseglib;

/**
 * @author Martin Vysny
 */
public class SegLibImage {
    /**
     * Color bmp image with color map.
     */
    public byte[] colorQualityBmpImage;
    /**
     * Total count of active pixels (pixels in high quality zone not lying in noisy background)
     */
    public int activePixelsCount;
}
