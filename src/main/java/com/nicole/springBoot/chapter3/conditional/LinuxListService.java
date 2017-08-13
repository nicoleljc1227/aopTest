package com.nicole.springBoot.chapter3.conditional;

/**
 * Created by xl on 2017/8/13.
 */
public class LinuxListService implements ListService {

    public String showListCmd() {
        return "ls";
    }
}
