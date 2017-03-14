/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.gooleToolbar.nz;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "nl.hu.gooleToolbar.nz.googleActionListener"
)
@ActionRegistration(
        iconBase = "nl/hu/gooleToolbar/nz/google24.png",
        displayName = "#CTL_googleActionListener"
)
@ActionReferences({
    @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_googleActionListener=Google")
public final class googleActionListener extends AbstractAction implements Presenter.Toolbar {
    
    public Component getToolbarPresenter() {
        return new GooglePanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
