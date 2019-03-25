package com.csnote.Visitor.src;

public interface Visitor {

    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}