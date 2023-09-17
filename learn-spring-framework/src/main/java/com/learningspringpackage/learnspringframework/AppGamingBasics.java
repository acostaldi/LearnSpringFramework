package com.learningspringpackage.learnspringframework;

import com.learningspringpackage.learnspringframework.game.GameRunner;
import com.learningspringpackage.learnspringframework.game.MarioGame;
import com.learningspringpackage.learnspringframework.game.SuperContraGame;

public class AppGamingBasics {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
    
}
