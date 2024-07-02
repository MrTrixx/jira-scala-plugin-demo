package ru.jira.scala.plugin.demo.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyJavaService {

    public void doDummyMethod() {
        log.debug("MyJavaService#method fired");
    }
}
