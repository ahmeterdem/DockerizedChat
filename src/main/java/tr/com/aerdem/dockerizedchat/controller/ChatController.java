package tr.com.aerdem.dockerizedchat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tr.com.aerdem.dockerizedchat.service.OpenAIService;


@RequiredArgsConstructor
@RestController
public class ChatController {
	private final OpenAIService openAIService;

	@GetMapping("/chat")
	public String callingAI(@RequestParam("userInput") String userInput) {
		String responseFromAI = openAIService.openAIServiceCall(userInput);
		return responseFromAI;
	}

}
