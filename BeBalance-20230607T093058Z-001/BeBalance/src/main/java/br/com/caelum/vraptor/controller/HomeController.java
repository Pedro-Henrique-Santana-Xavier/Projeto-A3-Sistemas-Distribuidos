package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;

@Path("home")
@Controller
public class HomeController {
	@Get("")
	public void home() {
		
	}
}
