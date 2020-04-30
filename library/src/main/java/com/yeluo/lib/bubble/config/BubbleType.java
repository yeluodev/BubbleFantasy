package com.yeluo.lib.bubble.config;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 气泡箭头摆放位置
 *
 * @author yeluodev1226
 * @date 2020-03-07 11:57
 */
@IntDef({BubbleType.TYPE_BUBBLE_LEFT,
        BubbleType.TYPE_BUBBLE_TOP,
        BubbleType.TYPE_BUBBLE_RIGHT,
        BubbleType.TYPE_BUBBLE_BOTTOM})
@Retention(RetentionPolicy.SOURCE)
public @interface BubbleType {
    /**
     * 箭头的朝向: 向左
     */
    int TYPE_BUBBLE_LEFT = 0x0000;
    /**
     * 箭头的朝向: 向上
     */
    int TYPE_BUBBLE_TOP = 0x0001;
    /**
     * 箭头的朝向: 向右
     */
    int TYPE_BUBBLE_RIGHT = 0x0002;
    /**
     * 箭头的朝向: 向下
     */
    int TYPE_BUBBLE_BOTTOM = 0x0003;
}
