package com.maaut.hungryfroggy.scenes;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.transitions.CCFadeTransition;
import org.cocos2d.types.CGPoint;

import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenHeight;
import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenResolution;
import static com.maaut.hungryfroggy.scenes.DeviceSettings.screenWidth;

/**
 * Created by maau_ on 13/05/2016.
 */
public class MenuButtons extends CCLayer implements ButtonDelegate{

    private Button playButton;
    private Button highscoredButton;
    private Button helpButton;
    private Button soundButton;

       public MenuButtons(){
        this.setIsTouchEnabled(true);
        this.playButton = new Button(Assets.PLAY);
        this.highscoredButton = new Button(Assets.HIGHSCORE);
        this.helpButton = new Button (Assets.HELP);

        setButtonspPosition();

        addChild(highscoredButton);
        addChild(helpButton);
        addChild(playButton);

           this.playButton.setDelegate(this);
           this.highscoredButton.setDelegate(this);
           this.helpButton.setDelegate(this);


    }

    private  void setButtonspPosition(){
        playButton.setPosition(
                screenResolution(
                        CGPoint.ccp(
                                screenWidth() / 2 , screenHeight () - 400
                        )
                )
        );
        highscoredButton.setPosition(
                screenResolution(
                        CGPoint.ccp( screenWidth() /2 , screenHeight() - 300 ))
        );

        helpButton.setPosition(
                screenResolution(
                        CGPoint.ccp( screenWidth() /2 , screenHeight() - 350 ))
        );
    }

    @Override
    public void buttonClicked(Button sender) {
        if (sender.equals(this.playButton)) {
            System.out.println("Button clicked: Play");
            CCDirector.sharedDirector().replaceScene(
                    CCFadeTransition.transition(1.0f,
                            GameScene.createGame()));
        }
        if (sender.equals(this.highscoredButton)) {
            System.out.println("Button clicked: Highscore");
        }
        if (sender.equals(this.helpButton)) {
            System.out.println("Button clicked: Help");
        }
        if (sender.equals(this.soundButton)) {
            System.out.println("Button clicked: Sound");
        }
    }



}

