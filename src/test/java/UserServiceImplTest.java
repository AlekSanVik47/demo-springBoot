import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
    @InjectMocks
    private UserServiceImpl userService;


    @Mock
    private UserRepository userRepository;


    @Mock
    private PasswordEncoder passwordEncoder;

    @Test
    public void testCreate() {

        User user = new User();

        user.setPassword("Qwerty123!");
        user.setLogin("user123");

        String encodedPassword = "jf2w0jisdlfnweijdf0qjiedsolkfmwepofdjmsd";

        Mockito.doReturn(encodedPassword).when(passwordEncoder)

                .encode(user.getPassword());

        userService.create(user);

        Mockito.verify(userRepository).save(user);

        Assertions.assertEquals(encodedPassword, user.getPassword());

    }
}
