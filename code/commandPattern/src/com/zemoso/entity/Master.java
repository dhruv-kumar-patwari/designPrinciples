package com.zemoso.entity;

import java.util.ArrayList;
import java.util.List;

public class Master {
    private CanCommand turnOn;
    private CanCommand turnOff;
    private CanCommand turnUp;
    private CanCommand turnDown;
    private List<CanCommand> commandsSent = new ArrayList<CanCommand>();
    private int top = 0;
    private int currentlyAt = 0;

    public Master(CanCommand turnOn, CanCommand turnOff, CanCommand turnUp, CanCommand turnDown) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.turnUp = turnUp;
        this.turnDown = turnDown;
    }

    public void clickOnButton(Slave slave){
        turnOn.execute(slave);
        commandsSent.add(currentlyAt++, turnOn);
        top = currentlyAt;
    }

    public void clickOffButton(Slave slave){
        turnOff.execute(slave);
        commandsSent.add(currentlyAt++, turnOff);
        top = currentlyAt;
    }

    public void clickUpButton(Slave slave){
        turnUp.execute(slave);
        commandsSent.add(currentlyAt++, turnUp);
        top = currentlyAt;
    }

    public void clickDownButton(Slave slave){
        turnDown.execute(slave);
        commandsSent.add(currentlyAt++, turnDown);
        top = currentlyAt;
    }

    public void clickUndoButton(Slave slave){
        CanCommand prevCommand= commandsSent.get(--currentlyAt);
        prevCommand.unexecute(slave);
    }

    public void clickRedoButton(Slave slave){
        if(top == currentlyAt)
            System.out.println("No more REDO can be done");
        else{
            CanCommand nextCommand = commandsSent.get(currentlyAt++);
            nextCommand.execute(slave);
        }
    }
}
