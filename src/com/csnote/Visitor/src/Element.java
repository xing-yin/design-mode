package com.csnote.Visitor.src;

public interface Element {
    void accept(Visitor visitor);
}