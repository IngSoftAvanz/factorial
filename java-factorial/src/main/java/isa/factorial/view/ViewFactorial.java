package isa.factorial.view;

import java.awt.event.ActionListener;

public interface ViewFactorial {
	public int getInput();
	public void setResult(long res);
	public void setMessage(String msg);
	public void setController(ActionListener ctr);
}
