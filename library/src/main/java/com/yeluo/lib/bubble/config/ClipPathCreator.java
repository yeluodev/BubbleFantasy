package com.yeluo.lib.bubble.config;

import android.graphics.Path;

/**
 * 裁切路径生成接口
 *
 * @author yeluodev1226
 * @date 2020/4/30 6:16 PM
 */
public interface ClipPathCreator {
    /**
     * 根据画布大小生成裁切路径
     *
     * @param width  画布宽
     * @param height 画布高
     * @return path
     */
    Path createClipPath(int width, int height);

    /**
     * 是否需要绘制bitmap
     *
     * @return boolean
     */
    boolean requiresBitmap();
}