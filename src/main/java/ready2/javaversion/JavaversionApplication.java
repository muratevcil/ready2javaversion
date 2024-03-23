package ready2.javaversion;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ready2.javaversion.domain.utils.exceptions.AuthorizationException;
import ready2.javaversion.domain.utils.exceptions.ProblemDetails;
import ready2.javaversion.domain.utils.exceptions.BusinessException;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class})
@RestControllerAdvice
public class JavaversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaversionApplication.class, args);
	}

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ProblemDetails handleBusinessException(BusinessException businessException) {
		ProblemDetails problemDetails = new ProblemDetails();
		problemDetails.setMessage(businessException.getMessage());
		problemDetails.setStatusCode(400);
		return problemDetails;
	}

	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.UNAUTHORIZED)
	public ProblemDetails handleAuthorizationException(AuthorizationException authorizationException){
		ProblemDetails problemDetails = new ProblemDetails();
		problemDetails.setMessage(authorizationException.getMessage());
		problemDetails.setStatusCode(401);
		return problemDetails;
	}



	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}


}
