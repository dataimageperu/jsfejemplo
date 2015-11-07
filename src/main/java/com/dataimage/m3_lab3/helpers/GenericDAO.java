/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dataimage.m3_lab3.helpers;

import java.util.List;

public interface GenericDAO<T> {

    public List<T> list();

    public T get(T t);

    public void save(T t);

    public void update(T t);

    public void delete(T t);
}
