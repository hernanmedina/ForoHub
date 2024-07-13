package api.hub.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegistroUsuarioDTO(
        Long id,
        @NotBlank
        @Size(min = 2, max = 50)
        String name,
        @NotBlank(message = "Utilice su correo electrónico como nombre de usuario")
        @Email
        @Pattern(regexp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
        String username,
        @NotBlank
        @Email
        @Pattern(regexp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")
        String email,
        @NotBlank(message = "Debe tener entre 6 y 10 caracteres.")
        String password
) {
        public Long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public String getEmail() {
                return email;
        }

}