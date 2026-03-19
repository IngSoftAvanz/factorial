package isa.factorial.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import isa.factorial.Factorial;
import isa.factorial.view.ViewFactorial;

public class CtrFactorial implements ActionListener {

	private Factorial model;
	private ViewFactorial view;
	
	public CtrFactorial(Factorial model, ViewFactorial view) {
		this.model = model;
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equalsIgnoreCase("Calcular")) {
			try {
				int n = view.getInput();
				long result = model.fact(n);
				view.setResult(result);
			} catch (NumberFormatException e) {
				view.setMessage("Error: la entrada no es número.");
			} catch (IllegalArgumentException e) {
				view.setMessage("Error: n debe ser entero positivo.");
			}	
		}
	}
}
