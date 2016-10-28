package com.maaut.hungryfroggy.scenes;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.types.CGPoint;

import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenHeight;
import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenResolution;
import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenWidth;

/**
 * Created by maau_ on 07/06/2016.
 */
public class GameScene extends CCLayer {
    private ScreenBackground background;
    private GameScene() {
        this.background = new ScreenBackground(Assets.BACKGROUND);
        this.background.setPosition(
                screenResolution(
                        CGPoint.ccp(screenWidth() / 2.0f, screenHeight() / 2.0f)));
        this.addChild(this.background);
    }

    public static CCScene createGame() {
        CCScene scene = CCScene.node();
        GameScene layer = new GameScene();
        scene.addChild(layer);
        return scene;
    }
}
