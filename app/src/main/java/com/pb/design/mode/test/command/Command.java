package com.pb.design.mode.test.command;

/**
 * Created by skytang on 2017/4/21.
 */

public interface Command {
     void execute();
     void undo();
     void redo();
}
