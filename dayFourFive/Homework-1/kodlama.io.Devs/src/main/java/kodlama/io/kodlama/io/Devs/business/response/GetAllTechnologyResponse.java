package kodlama.io.kodlama.io.Devs.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologyResponse {

	private int technologyId;
	private String technologyName;
	
	private int programmingLanguageId;
	private String programmingLanguageName;
}