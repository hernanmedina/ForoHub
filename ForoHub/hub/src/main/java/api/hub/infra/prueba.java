/*
// AutenticacionController.java
@RestController
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AutenticacionService autenticacionService;

    @PostMapping
    @Transactional
    public ResponseEntity autenticarUsuario(@RequestBody @Valid RegistroUsuarioDTO usuarioDTO) {
        try {
            var autenticacionUsuario = autenticacionService.autenticar(usuarioDTO.email(), usuarioDTO.password());
            var token = autenticacionService.generarToken(autenticacionUsuario);
            return ResponseEntity.ok(new JWTTokenDTO(token));
        } catch (AuthenticationException e) {
            return ResponseEntity.badRequest().body("Credenciales incorrectas");
        }
    }
}

// RegistroUsuarioDTO.java
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
        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,10}$")
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

       /* public Object getPerfil() {
                return perfil;
        }

        }

// AutenticacionService.java
@Service
public class AutenticacionService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    public Authentication autenticar(String email, String password) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(email, password);
        return authenticationManager.authenticate(authToken);
    }

    public String generarToken(Authentication authentication) {
        return tokenService.generarToken((Usuario) authentication.getPrincipal());
    }
}*/


