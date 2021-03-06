package org.simplepresenter.commands;

public interface DataCommand<D> extends DistinctViewCommand, DispatchedViewCommand {

    D getData();
}
