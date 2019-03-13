package com.spring4all.designpattern.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiankeqin
 * @Description: DESCRIPTION
 * @date 2019-03-12 13:43
 */
public class Stack {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommand(){
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}