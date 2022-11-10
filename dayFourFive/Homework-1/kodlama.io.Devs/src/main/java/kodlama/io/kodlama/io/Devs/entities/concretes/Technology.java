package kodlama.io.kodlama.io.Devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "technologies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int technologyId;
	
	@Column(name = "name")
	private String technologyName;
	
	@ManyToOne
	@JoinColumn(name = "programmingLaguageId")
	private ProgrammingLanguage programmingLanguage;
}