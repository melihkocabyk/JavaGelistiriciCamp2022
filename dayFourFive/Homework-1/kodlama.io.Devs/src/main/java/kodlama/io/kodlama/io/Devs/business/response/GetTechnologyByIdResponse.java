package kodlama.io.kodlama.io.Devs.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTechnologyByIdResponse {

	private int technologyId;
	
	private int programmingLanguageId;
}