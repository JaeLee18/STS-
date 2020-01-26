package api.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class TopicController {

		@Autowired
		private TopicService topicservice;
		
		@RequestMapping("/topics")
		// Returning Topic objects in List Type
		public List<Topic> getAllTopics() {
			// Here to connect 
			return topicservice.getAllTopics();
		}
}
