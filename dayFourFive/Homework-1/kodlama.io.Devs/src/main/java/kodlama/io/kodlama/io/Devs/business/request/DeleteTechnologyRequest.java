package kodlama.io.kodlama.io.Devs.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteTechnologyRequest {

	private int technologyId;
	
	private int programmingLanguageId;
}