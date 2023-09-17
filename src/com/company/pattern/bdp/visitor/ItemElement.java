package com.company.pattern.bdp.visitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);

}
