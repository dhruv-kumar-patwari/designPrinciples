package com.zemoso.entity;

public interface CanCommand {
    void execute(Slave slave);
    void unexecute(Slave slave);
}
