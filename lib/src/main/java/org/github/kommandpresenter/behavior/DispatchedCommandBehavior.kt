package org.github.kommandpresenter.behavior

import org.github.kommandpresenter.ViewCommand
import org.github.kommandpresenter.commands.DispatchedViewCommand
import org.github.kommandpresenter.behavior.AbstractCommandBehavior

class DispatchedCommandBehavior : AbstractCommandBehavior() {

    override fun afterDispatched(current: ViewCommand, list: List<ViewCommand>): List<ViewCommand> {
        if (current is DispatchedViewCommand) {
            current.isDispatched = true
        }
        return list
    }
}