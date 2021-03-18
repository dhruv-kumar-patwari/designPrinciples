package com.zemoso.interactor;

import com.zemoso.entity.CanCommand;
import com.zemoso.entity.Slave;

public class DimsDownLight implements CanCommand {
    @Override
    public void execute(Slave slave) {
        slave.down();
    }

    @Override
    public void unexecute(Slave slave) {
        slave.up();
    }
}
