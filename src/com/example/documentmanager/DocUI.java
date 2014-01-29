package com.example.documentmanager;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("documentmanager")
public class DocUI extends UI {
	private LoginPanel loginpanel;
	private MainFramePanel mainframepanel;
	private VerticalLayout layout;
	private ErrorMsg error;

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = DocUI.class)
	public static class Servlet extends VaadinServlet {
	}

	protected void init(VaadinRequest request) {
		loginpanel = new LoginPanel(this);
		mainframepanel = new MainFramePanel(this);
		error = new ErrorMsg(this);

		mainframepanel.setVisible(false);
		error.setVisible(false);
		loginpanel.setVisible(true);

		layout = new VerticalLayout();
		layout.addComponent(loginpanel);
		layout.addComponent(mainframepanel);
		layout.addComponent(error);

		this.setContent(layout);
	}

	public void loginOk() {
		try {
			;
			loginpanel.setVisible(false);

			mainframepanel.setVisible(true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loginFalse() {
		loginpanel.setVisible(true);
		error.setVisible(true);

	}
}