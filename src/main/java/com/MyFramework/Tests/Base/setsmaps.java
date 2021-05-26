package com.MyFramework.Tests.Base;

import io.cucumber.java.sl.In;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setsmaps {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<Integer>();
        Set<String> st2 = new HashSet<String>();
        System.out.println(st.isEmpty());
        st.add(3);
        st.add(2);
        st.add(1);
        System.out.println(st);
        st2.add("xalex");
        st2.add("zebra");
        st2.add("john");
        System.out.println(st2);


}}
