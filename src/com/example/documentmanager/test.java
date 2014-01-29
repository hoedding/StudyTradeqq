package com.example.documentmanager;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}
/*
  
 package com.example.documentmanager;

import java.util.List;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Item;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Theme("documentmanager")
public class DocUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = DocUI.class)
	public static class Servlet extends VaadinServlet {
	}


	


	@SuppressWarnings("unchecked")
	@Override
	protected void init(VaadinRequest request) {

		Database db = new Database();
HorizontalSplitPanel split = new HorizontalSplitPanel();

		final Table tb = new Table("This is my table");
		tb.addContainerProperty("String", String.class, null);
tb.setSelectable(true);

		List<String> ls = db.connect();

		for( int i = 0; i < ls.size(); i++)
		{
			Object newItemId = tb.addItem();
			Item row1 = tb.getItem(newItemId);
			row1.getItemProperty("String").setValue(ls.get(i));
		}

	setContent(split);
	split.addComponent(tb);
	
	}



} 
 
 * */
}
