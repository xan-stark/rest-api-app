package api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagens")
public class ExemploApi {
	@GetMapping("/HelloWorld")
	public String GetHelloWorld() {
		return "Hello World";
	}
}
