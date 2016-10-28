package com.maaut.hungryfroggy.scenes;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenHeight;
import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenResolution;
import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenWidth;

/**
 * Created by maau_ on 12/05/2016.
 */
public class TitleScreen extends CCLayer {

        private ScreenBackground background;

        public TitleScreen(){
            this.background = new ScreenBackground(Assets.BACKGROUND);
            MenuButtons menuLayer = new MenuButtons();
            this.background.setPosition(
                   screenResolution(CGPoint.ccp(
                           screenWidth() / 2.0f,
                           screenHeight() /2.0f
                    ))
            );
            CCSprite title = CCSprite.sprite(Assets.LOGO);
            title.setPosition(screenResolution(
                    CGPoint.ccp( screenWidth() /2 , screenHeight() - 150 )));

            this.addChild(this.background);
            this.addChild(title);
            this.addChild(menuLayer);

        }


    public CCScene scene(){
            CCScene scene = CCScene.node();
            scene.addChild(this);
            return scene;
        }


}
