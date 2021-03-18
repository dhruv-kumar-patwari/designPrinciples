package com.zemoso.interactor;

import com.zemoso.entity.CanCommand;
import com.zemoso.entity.Slave;

public class TurnsUpLight implements CanCommand {
    @Override
    public void execute(Slave slave) {
        slave.up();
    }

    @Override
    public void unexecute(Slave slave) {
        slave.down();
    }
}
