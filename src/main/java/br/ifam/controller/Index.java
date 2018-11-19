package br.ifam.controller;

import org.mentawai.core.ApplicationManager;

import br.ifam.action.IndexAction;

public class Index extends ApplicationManager{

	@Override
	public void loadActions() {
		
		action("/index",IndexAction.class).on(SUCCESS, fwd("/pages/index.jsp"));
		
	}
}
