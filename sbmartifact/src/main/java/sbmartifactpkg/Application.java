package sbmartifactpkg;

/*
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
*/

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping(value="/")
	public Map<String, String> demo() throws UnknownHostException{
		/*List<Character> temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars()
	            .mapToObj(i -> (char)i)
	            .collect(Collectors.toList());
	    Collections.shuffle(temp, new SecureRandom());
	    return temp.stream()
	            .map(Object::toString)
	            .limit(5)
	            .collect(Collectors.joining());*/
		
		Map<String, String> map = new HashMap<String, String>();
		
		String host = InetAddress.getLocalHost().getHostAddress().toString();
		map.put("Server", host );
		
		return map;
		
	}
}
