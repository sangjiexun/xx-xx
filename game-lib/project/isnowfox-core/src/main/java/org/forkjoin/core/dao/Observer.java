package org.forkjoin.core.dao;

/**
 * Bean观察者接口
 *
 * @author zuoge85
 */
public interface Observer {
    void changeProperty(String name, Object o);
}
