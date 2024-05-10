package com.spring1.controller;

import java.util.List;

import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.protobuf.TextFormat.ParseException;
import com.spring1.dto.Classroom;
import com.spring1.dto.Sample;
import com.spring1.dto.Student;
import com.spring1.service.SampleService;

//REST(REpresentation State Transfer) : 표현 가능한 자원의 상태를 전송
//RESTful : 표현 가능한 자원의 상태를 자유롭게 전송할 수 있는
//API : 프로그래밍시에 활용할 수 있는 애플리케이션 형태의 자원
//RESTful API(Application Programming Interface Of REpresentation State Transfer)
@RestController //@ResponseBody + @Controller : JSON으로 출력
@RequestMapping("/api/")
public class RestfulController {

	private static final Logger log = LoggerFactory.getLogger(RestfulController.class);
	
	
	
	@Autowired
	private SampleService sampleService;
	

	
	@GetMapping("api1.do")
	public int getApi1() {
		return 1004;
	}
	

	
	@PostMapping("api6.do")
	public String postStudent(@RequestBody Student std) {
		String response= String.format("\n<학생 정보>\n이름 : %s\n번호 : %d\n나이 : %d", std.getName(), std.getStdNumber(), std.getAge());
		log.info("postStudent response : "+response);
		return response;
	}
	
	@PostMapping("api7.do")
	public String postAllStudent(@RequestBody List<Student> stds) {
		String response = "\n<학급 정보>\n";
		int i = 1;
		for(Student s : stds) {
			response += String.format("학생%d: 이름 : %s\t번호 : %d\n나이 : %d\n", i, s.getName(), s.getStdNumber(), s.getAge());
			i++;
		}
		log.info("postStudent response : "+response);
		return response;
	}
	
	@PostMapping("api8.do")
	public String postClassroom(@RequestBody Classroom team) {
		String response = String.format("\n<팀 정보>\n학과명 : %s\n : %d\n", team.getPart(), team.getClassNum());
		int i =1;
		for (Student s : team.getStudents()) {
			response = String.format("\n<팀 정보>\n학과명 : %s\n : %d\n", i, s.getName(), s.getStdNumber(), s.getAge()); i++;
			log.info("postClassroom response : "+response);
			
		}
		return response;
	}
	
	@PostMapping("api9.do")
	public Student convertStringToStudent1(@RequestBody String jsonstr) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject)
			
		Student std = new Student(Integer.valueOf(jsonObject.get("stdNumber").toString()),jsonObject.get("name").toString(), Integer.valueOf(jasonObject.get("age").toString()));
		log.info("convertStringToStudent1 response : "+std);
		return std;
	}
	
	@GetMapping("api6.do")
	public List<Sample> postApi5() {
		List<Sample> testList = sampleService.getSampleList(); 
		return testList;
	}
	
	

	
}