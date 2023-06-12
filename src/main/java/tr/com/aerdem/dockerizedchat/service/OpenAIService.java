package tr.com.aerdem.dockerizedchat.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import tr.com.aerdem.dockerizedchat.dto.AIResultDTO;


@RequiredArgsConstructor
@Service
public class OpenAIService {
	private final RestTemplate restTemplate;
	@Value("${openAI.APIKey}")
	private String openAIAPIKey;
	@Value("${openAI.ModelId}")
	private String openAIModelId;
	@Value("${openAI.URL}")
	private String openAIURL;

	public String openAIServiceCall(String userInput) {
		String result = "No answer from Chat GPT";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + openAIAPIKey);

		String requestBody = "{\"model\":\"" + openAIModelId + "\"," + " \"messages\":["
				+ "{\"role\": \"user\", \"content\":\"" + userInput + "\"}" + "]" + "}";
		HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
		AIResultDTO aiResultDTO = restTemplate.postForObject(openAIURL, request, AIResultDTO.class);
		result = aiResultDTO.getChoices().toString();
		return result;
	}
}
