package MovieDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;
@Entity
@Data
public class Movies {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
   String Moviename;
   String language;
   String description;
   String[] Genre;
   int rating;
   @Lob
   byte[] poster;
}