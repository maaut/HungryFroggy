package com.maaut.hungryfroggy.scenes;

import org.cocos2d.nodes.CCDirector;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

/**
 * Created by maau_ on 12/05/2016.
 */
public class DeviceSettings {

    public static CGPoint screenResolution(CGPoint gcPoint) {

        return gcPoint;

    }

    public static float screenWidth() {

        return winSize().width;

    }

    public static float screenHeight() {

        return winSize().height;

    }

    public static CGSize winSize() {

        return CCDirector.sharedDirector().winSize();

    }

}
