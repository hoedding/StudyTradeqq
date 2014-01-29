package com.example.documentmanager;

import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;

public class ErrorMsg extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final DocUI main;

	public ErrorMsg(DocUI main) {
		this.main = main;
		Label label = new Label("Login fehlgeschlagen !!!");
		setContent(label);
	}

}
 