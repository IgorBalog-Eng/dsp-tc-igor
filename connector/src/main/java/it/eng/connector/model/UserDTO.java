package it.eng.connector.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	  private String firstName;
	  private String lastName;
	  private String email;
	  private String password;
	  private String newPassword;
	  private Role role;
}
