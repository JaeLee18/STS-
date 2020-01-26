package api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

		@RequestMapping("/topics")
		// Returning Topic objects in List Type
		public List<Topic> getAllTopics() {
			// Here to connect 
			return Arrays.asList(
					new Topic("spring", "Spring.framework", "Spring Framework description"),
					new Topic("java", "java framework", "java Framework description"),
					new Topic("python", "flask", "python description")
					);
		}
}
