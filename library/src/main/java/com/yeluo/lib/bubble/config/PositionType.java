package com.yeluo.lib.bubble.config;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 气泡控件所在边对齐类型
 *
 * @author yeluodev1226
 */
@IntDef({PositionType.TYPE_POSITION_LEFT,
        PositionType.TYPE_POSITION_CENTER,
        PositionType.TYPE_POSITION_RIGHT})
@Retention(RetentionPolicy.SOURCE)
public @interface PositionType {
    /**
     * 站在控件的中心点,
     * 箭头在箭头所在边的位置: 左手边
     * 想象一下, 你站在中心点, 正对着箭头所在的边的方向, 这个时候箭头在你的那个位置?
     */
    int TYPE_POSITION_LEFT = 0x0100;
    /**
     * 站在控件的中心点,
     * 箭头在箭头所在边的位置: 中间
     */
    int TYPE_POSITION_CENTER = 0x0101;
    /**
     * 站在控件的中心点,
     * 箭头在箭头所在边的位置: 右手边
     */
    int TYPE_POSITION_RIGHT = 0x0102;
}
