package kodlama.io.kodlama.io.Devs.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgrammingLanguageRequest {

	private int programmingLanguageId;
	private String programmingLanguageName;
}