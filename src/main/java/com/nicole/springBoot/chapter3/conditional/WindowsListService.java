package com.nicole.springBoot.chapter3.conditional;

/**
 * Created by xl on 2017/8/13.
 */
public class WindowsListService implements ListService {

    public String showListCmd() {
        return "dir";
    }
}
