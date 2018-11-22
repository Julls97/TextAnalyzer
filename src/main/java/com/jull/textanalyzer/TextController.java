package com.jull.textanalyzer;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class TextController {
	@PostMapping("/count_one_word/{word}")
	public ResponseEntity countOneWord(@RequestBody String text, @PathVariable("word") String word) {
		Pattern pattern = Pattern.compile(word);
		Matcher matcher = pattern.matcher(text);
		int count = 0;
		while (matcher.find()) count++;
		return new ResponseEntity(count, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/toUpper")
	public ResponseEntity toUpper(@RequestBody String text) {
		String newText = text.toUpperCase();
		return new ResponseEntity(newText, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/countCharacters")
	public ResponseEntity countCharacters(@RequestBody String text) {
		HashMap<Character, Integer> collect = new HashMap<Character, Integer>();
		
		for (Character c : text.toLowerCase().toCharArray())
			collect.put(c, collect.containsKey(c) ? ( collect.get(c) + 1 ) : 1);
		
		return new ResponseEntity(collect, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/countWords")
	public ResponseEntity countWords(@RequestBody String text) {
		HashMap<String, Integer> collect = new HashMap<String, Integer>();
		
		for (String c : text.toLowerCase().split(" "))
			collect.put(c, collect.containsKey(c) ? ( collect.get(c) + 1 ) : 1);
		
		return new ResponseEntity(collect, new HttpHeaders(), HttpStatus.OK);
	}
}
