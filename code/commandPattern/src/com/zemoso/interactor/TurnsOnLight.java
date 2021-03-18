package com.zemoso.interactor;

import com.zemoso.entity.CanCommand;
import com.zemoso.entity.Slave;

public class TurnsOnLight implements CanCommand {
    @Override
    public void execute(Slave slave) {
        slave.on();
    }

    @Override
    public void unexecute(Slave slave) {
        slave.off();
    }
}
