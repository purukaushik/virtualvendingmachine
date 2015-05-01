package vendingmachine.plugin.ui;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ProductSelectorDialogAction implements IObjectActionDelegate {

	private Shell shell;

	private IWorkbenchPart part;

	@Override
	public void run(IAction arg0) {
		SelectorPanelDialog selectorPanelDialog = new SelectorPanelDialog(shell);
		ISelection selection = part.getSite().getSelectionProvider()
				.getSelection();
		if (selection instanceof TreeSelection) {

			TreeSelection treeSelection = (TreeSelection) selection;
			Object firstElement = treeSelection.getFirstElement();
			if (firstElement instanceof IFile) {
				try {
					selectorPanelDialog.loadContent((IFile) firstElement);
				} catch (IOException e) {
					Status status = new Status(IStatus.ERROR, "vendingMachine",
							0, e.getMessage(), null);
					ErrorDialog.openError(shell, "Error on load",
							"File could not be loaded", status);
				} catch (RuntimeException e) {
					Status status = new Status(IStatus.ERROR, "vendingMachine",
							0, e.getMessage(), null);
					ErrorDialog.openError(shell, "Error on load",
							"Probably there is no Vending Machine"
									+ " contained in the ressource", status);
				}
				selectorPanelDialog.open();
			}
		}

	}

	@Override
	public void selectionChanged(IAction arg0, ISelection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		part = targetPart;

	}

}
