package com.zemoso;

import com.zemoso.entity.Master;
import com.zemoso.entity.Slave;
import com.zemoso.interactor.DimsDownLight;
import com.zemoso.interactor.TurnsOffLight;
import com.zemoso.interactor.TurnsOnLight;
import com.zemoso.interactor.TurnsUpLight;

public class Main {

    public static void main(String[] args) {
        Master remote = new Master(new TurnsOnLight(), new TurnsOffLight(), new TurnsUpLight(), new DimsDownLight());
        Slave light = new Slave();
        remote.clickOnButton(light);
        remote.clickOffButton(light);
        remote.clickUpButton(light);
        remote.clickDownButton(light);
        remote.clickUndoButton(light);
        remote.clickUndoButton(light);
        remote.clickUndoButton(light);
        remote.clickUndoButton(light);
        remote.clickRedoButton(light);
        remote.clickRedoButton(light);
        remote.clickRedoButton(light);
    }
}
