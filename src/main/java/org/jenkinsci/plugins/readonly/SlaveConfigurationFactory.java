/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jenkinsci.plugins.readonly;

import com.google.common.base.Functions;
import hudson.Extension;
import hudson.Util;
import hudson.model.Action;
import hudson.model.Computer;
import hudson.model.TransientComputerActionFactory;
import hudson.security.Permission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Lucie Votypkova
 */
@Extension
public class SlaveConfigurationFactory extends TransientComputerActionFactory {

    @Override
    public Collection<? extends Action> createFor(Computer computer) {
        List<Action> actions = new ArrayList<Action>();
        actions.add(new SlaveConfiguration(computer));
        return actions;
    }
    
}
