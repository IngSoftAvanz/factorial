package isa;

import javax.swing.SwingUtilities;

import isa.factorial.Factorial;
import isa.factorial.FactorialImpl;
import isa.factorial.controller.CtrFactorial;
import isa.factorial.view.ViewFactImpl1;
import isa.factorial.view.ViewFactorial;

public class MainView {

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> {
    		Factorial model = new FactorialImpl();
        	ViewFactorial view = new ViewFactImpl1();
        	CtrFactorial controller = new CtrFactorial(model, view);
        	view.setController(controller);
    	});
    }
}