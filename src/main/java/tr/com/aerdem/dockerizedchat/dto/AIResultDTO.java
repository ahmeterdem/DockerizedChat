package tr.com.aerdem.dockerizedchat.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
public class AIResultDTO {
	@JsonProperty("id")
	protected Object id;

	@JsonProperty("choices")
	protected Object choices;

	@JsonProperty("usage")
	protected Object usage;

	@JsonProperty("model")
	protected Object model;

	@JsonProperty("created")
	protected Object created;

	@JsonProperty("object")
	protected Object object;

}
