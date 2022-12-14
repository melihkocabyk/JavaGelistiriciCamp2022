package kodlama.io.kodlama.io.Devs.entities.concretes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "programmingLanguages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int programmingLanguageId;
	
	@Column(name = "name")
	private String programmingLanguageName;
	
	@OneToMany(mappedBy = "programmingLanguage", cascade = CascadeType.ALL)
	Set<Technology> technologies;
}