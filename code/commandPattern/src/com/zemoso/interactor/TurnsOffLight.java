package com.zemoso.interactor;

import com.zemoso.entity.CanCommand;
import com.zemoso.entity.Slave;

public class TurnsOffLight implements CanCommand {
    @Override
    public void execute(Slave slave) {
        slave.off();
    }

    @Override
    public void unexecute(Slave slave) {
        slave.on();
    }
}
