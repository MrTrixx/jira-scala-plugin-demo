package ru.jira.scala.plugin.demo.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaPluginStarter implements PluginStarter {

    @Override
    public void onStart() {
        log.debug("JavaPluginStarter#start fired");
    }
}
