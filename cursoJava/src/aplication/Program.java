package aplication;

import java.text.ParseException;
import java.util.Date;

import entities.Coment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Date moment = Post.sdf.parse("21/06/2018 13:05:44");
		String title = "Traveling to New Zeland";
		String content = "I´m going to visit this wonderful country!";
		Integer likes = 12;
		
		Post p1 = new Post(moment, title, content, likes);
		
		Coment c1 = new Coment("Have a nice trip");
		Coment c2 = new Coment("Wow that´s awesome!");
		
		p1.addComent(c1);
		p1.addComent(c2);
		
		System.out.println(p1);
		
		moment = Post.sdf.parse("28/07/2018 23:14:19");
		title = "Good Night guys";
		content = "See you tomorow";
		likes = 5;
		
		Post p2 = new Post(moment, title, content, likes);
		
		Coment c3 = new Coment("Good night");
		Coment c4 = new Coment("May the Force be with you");
		
		p2.addComent(c3);
		p2.addComent(c4);
		
		System.out.println(p2);
		
	}

}
