package application.service;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.security.core.userdatails.UserDetails;
import org.springframework.security.core.userdatails.UserDetailsService;
import org.springframework.security;core.userdatails.UsernameNotFoundException;
import org.springframework.stereotype.service;
import application.repository.UserRepository;

@service
public class AppUserDetailsService{
    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userRepo.findByUsername(username);
        if (user==null){
        throw new UsernameNotFoundException("Usuário Não Encontrado");
    }
        UserDetails = 
        org.springframework.security.core.userdetails.User.builder()
        .username(user.getUsername())
        .password(user.getPassword())
        .roles("USER")
        build();
    
    return UserDetails;
    }
}